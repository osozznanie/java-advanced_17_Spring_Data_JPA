package com.example;

import com.example.domain.University;
import com.example.service.UniversityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UniversityService service = ctx.getBean(UniversityService.class);

		University u= new University();
		u.setName("Lviv");
		u.setAccreditationLevel("Institute");
		u.setNumOfStudents(2133);
		u.setNumOfInstitutes(213);
		u.setAddress("ul. MyHouse55");

		// save1
		service.save(u);

		University u2= new University();
		u2.setName("Nau");
		u2.setAccreditationLevel("Institute");
		u2.setNumOfStudents(3213);
		u2.setNumOfInstitutes(312);
		u2.setAddress("ul. MyHouse551");

		// save2
		service.save(u2);

		University u3= new University();
		u3.setName("KPI");
		u3.setAccreditationLevel("Institute");
		u3.setNumOfStudents(123);
		u3.setNumOfInstitutes(123);
		u3.setAddress("ul. MyHouse213");

		// save3
		service.save(u3);

		University u4= new University();
		u4.setName("Sheva");
		u4.setAccreditationLevel("Institute");
		u4.setNumOfStudents(543);
		u4.setNumOfInstitutes(3221);
		u4.setAddress("ul. MyHouse12");

		// save4
		service.save(u4);

		University u5= new University();
		u5.setName("Lviv");
		u5.setAccreditationLevel("Institute");
		u5.setNumOfStudents(4534);
		u5.setNumOfInstitutes(234);
		u5.setAddress("ul. MyHouse235");

		// save5
		service.save(u5);

		service.deleteById(1L);

		System.out.println(service.findByAddress("ul. MyHouse235"));

		service.findAll().forEach(System.out::println);





	}

}
