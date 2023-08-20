package com.example.service.impl;

import com.example.dao.UniversityRepository;
import com.example.domain.University;
import com.example.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private UniversityRepository ur;
    @Override
    public void save(University university) {
        ur.save(university);
    }

    @Override
    public University findById(Long id) {
        return ur.findById(id).orElse(null);
    }

    @Override
    public University update(University university) {
        return ur.save(university);
    }

    @Override
    public void deleteById(Long id) {
        ur.deleteById(id);
    }

    @Override
    public List<University> findByName(String name) {
        return ur.findByName(name);
    }

    @Override
    public List<University> findByAddress(String address) {
        return ur.findByAddress(address);
    }

    @Override
    public List<University> findAll() {
        return ur.findAll();
    }
}
