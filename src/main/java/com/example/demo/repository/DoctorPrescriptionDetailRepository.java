package com.example.demo.repository;

import com.example.demo.entity.DoctorPrescriptionDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorPrescriptionDetailRepository extends JpaRepository<DoctorPrescriptionDetail, Integer> {
}
