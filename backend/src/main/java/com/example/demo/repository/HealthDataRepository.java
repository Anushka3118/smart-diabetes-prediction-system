package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.demo.model.HealthData;

public interface HealthDataRepository extends JpaRepository<HealthData, Long> {
    List<HealthData> findByEmail(String email);
}