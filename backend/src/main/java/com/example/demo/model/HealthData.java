package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class HealthData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int age;
    private double bmi;
    private int glucose;
    private int bloodPressure;

    private String email; // user identify karne ke liye

    // getters setters
    public Long getId() { return id; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getBmi() { return bmi; }
    public void setBmi(double bmi) { this.bmi = bmi; }

    public int getGlucose() { return glucose; }
    public void setGlucose(int glucose) { this.glucose = glucose; }

    public int getBloodPressure() { return bloodPressure; }
    public void setBloodPressure(int bloodPressure) { this.bloodPressure = bloodPressure; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}