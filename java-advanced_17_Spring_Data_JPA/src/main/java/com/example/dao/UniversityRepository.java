package com.example.dao;

import com.example.domain.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UniversityRepository extends JpaRepository<University, Long>, CrudRepository<University, Long> {
        List<University> findByName(String name);
        List<University> findByAddress(String address);
}
