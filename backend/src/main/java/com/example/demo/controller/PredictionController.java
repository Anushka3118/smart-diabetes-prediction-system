package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.PredictionRequest;
import com.example.demo.model.PredictionResponse;
import com.example.demo.service.PredictionService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PredictionController {

    @Autowired
    private PredictionService predictionService;

    @PostMapping("/predict")
    public PredictionResponse predict(@RequestBody PredictionRequest request) {
        return predictionService.predict(request);
    }
}