package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.demo.model.HealthData;
import com.example.demo.service.HealthDataService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HealthDataController {

    @Autowired
    private HealthDataService service;

    @PostMapping("/submit-health-data")
    public HealthData save(@RequestBody HealthData data) {
        return service.saveData(data);
    }

    @GetMapping("/health-data")
    public List<HealthData> getAll() {
        return service.getAllData();
    }

    @GetMapping("/health-data/{email}")
    public List<HealthData> getByEmail(@PathVariable String email) {
        return service.getDataByEmail(email);
    }
}
