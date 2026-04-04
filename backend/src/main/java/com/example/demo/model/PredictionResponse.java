package com.example.demo.model;

public class PredictionResponse {

    private String riskLevel;
    private double probability;

    public PredictionResponse(String riskLevel, double probability) {
        this.riskLevel = riskLevel;
        this.probability = probability;
    }

    public String getRiskLevel() { return riskLevel; }
    public double getProbability() { return probability; }
}