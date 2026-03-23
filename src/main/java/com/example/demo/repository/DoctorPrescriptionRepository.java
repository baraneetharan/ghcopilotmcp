package com.example.demo.repository;

import com.example.demo.entity.DoctorPrescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorPrescriptionRepository extends JpaRepository<DoctorPrescription, Integer> {
}
