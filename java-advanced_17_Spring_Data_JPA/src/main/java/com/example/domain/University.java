package com.example.domain;

import jakarta.persistence.*;

@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column(name = "accreditation_level")
    private String accreditationLevel;
    @Column(name = "num_of_institutes")
    private int numOfInstitutes;
    @Column(name = "num_of_students")
    private int numOfStudents;
    @Column
    private String address;

    public University(String name, String accreditationLevel, int numOfInstitutes, int numOfStudents, String address) {
        this.name = name;
        this.accreditationLevel = accreditationLevel;
        this.numOfInstitutes = numOfInstitutes;
        this.numOfStudents = numOfStudents;
        this.address = address;
    }

    public University() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccreditationLevel() {
        return accreditationLevel;
    }

    public void setAccreditationLevel(String accreditationLevel) {
        this.accreditationLevel = accreditationLevel;
    }

    public int getNumOfInstitutes() {
        return numOfInstitutes;
    }

    public void setNumOfInstitutes(int numOfInstitutes) {
        this.numOfInstitutes = numOfInstitutes;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" + "id=" + id + ", name='" + name + '\'' + ", accreditationLevel='" + accreditationLevel + '\'' + ", numOfInstitutes=" + numOfInstitutes + ", numOfStudents=" + numOfStudents + ", address='" + address + '\'' + '}';
    }
}
