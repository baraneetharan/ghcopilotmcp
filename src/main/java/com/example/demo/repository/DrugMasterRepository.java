package com.example.demo.repository;

import com.example.demo.entity.DrugMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugMasterRepository extends JpaRepository<DrugMaster, Integer> {
}
