package com.example.demo.model;

public class PredictionRequest {

    private int age;
    private double bmi;
    private int glucose;
    private int bloodPressure;

    // getters setters
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getBmi() { return bmi; }
    public void setBmi(double bmi) { this.bmi = bmi; }

    public int getGlucose() { return glucose; }
    public void setGlucose(int glucose) { this.glucose = glucose; }

    public int getBloodPressure() { return bloodPressure; }
    public void setBloodPressure(int bloodPressure) { this.bloodPressure = bloodPressure; }
}