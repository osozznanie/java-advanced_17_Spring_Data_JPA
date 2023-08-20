package com.example.service;

import com.example.domain.University;

import java.util.List;

public interface UniversityService {
    void save(University university);
    University findById(Long id);
    University update(University university);
    void deleteById(Long id);
    List<University> findByName(String name);
    List<University> findByAddress(String address);
    List<University> findAll();

}
