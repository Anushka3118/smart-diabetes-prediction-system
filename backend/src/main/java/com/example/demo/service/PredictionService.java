package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.PredictionRequest;
import com.example.demo.model.PredictionResponse;

@Service
public class PredictionService {

    public PredictionResponse predict(PredictionRequest request) {

        double score = 0;

        // simple rule-based logic
        if (request.getGlucose() > 140) score += 0.4;
        if (request.getBmi() > 30) score += 0.3;
        if (request.getAge() > 45) score += 0.2;
        if (request.getBloodPressure() > 90) score += 0.1;

        String risk;
        if (score > 0.6) {
            risk = "High";
        } else if (score > 0.3) {
            risk = "Medium";
        } else {
            risk = "Low";
        }

        return new PredictionResponse(risk, score * 100);
    }
}