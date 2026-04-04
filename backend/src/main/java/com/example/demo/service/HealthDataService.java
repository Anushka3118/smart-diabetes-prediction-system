package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.model.HealthData;
import com.example.demo.repository.HealthDataRepository;

@Service
public class HealthDataService {

    @Autowired
    private HealthDataRepository repo;

    public HealthData saveData(HealthData data) {
        return repo.save(data);
    }

    public List<HealthData> getAllData() {
        return repo.findAll();
    }

    public List<HealthData> getDataByEmail(String email) {
        return repo.findByEmail(email);
    }
}
