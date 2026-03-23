package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
// @Table(name = "trn_drug_master")
public class DrugMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String pharmacyDrugName;
    private Integer presDrugId;
    @Column(length = 500)
    private String presDrugName;
    @Column(length = 500)
    private String chemicalName;
    @Column(length = 500)
    private String drugChemicalName;
    private String medicalNonMedical;
    private Integer status;
    private Integer createdBy;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Integer updatedBy;
    private LocalDateTime deletedAt;
    private Integer deletedBy;
    private String hsnCode;

    public DrugMaster() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getPharmacyDrugName() { return pharmacyDrugName; }
    public void setPharmacyDrugName(String pharmacyDrugName) { this.pharmacyDrugName = pharmacyDrugName; }
    public Integer getPresDrugId() { return presDrugId; }
    public void setPresDrugId(Integer presDrugId) { this.presDrugId = presDrugId; }
    public String getPresDrugName() { return presDrugName; }
    public void setPresDrugName(String presDrugName) { this.presDrugName = presDrugName; }
    public String getChemicalName() { return chemicalName; }
    public void setChemicalName(String chemicalName) { this.chemicalName = chemicalName; }
    public String getDrugChemicalName() { return drugChemicalName; }
    public void setDrugChemicalName(String drugChemicalName) { this.drugChemicalName = drugChemicalName; }
    public String getMedicalNonMedical() { return medicalNonMedical; }
    public void setMedicalNonMedical(String medicalNonMedical) { this.medicalNonMedical = medicalNonMedical; }
    public Integer getStatus() { return status; }
    public void setStatus(Integer status) { this.status = status; }
    public Integer getCreatedBy() { return createdBy; }
    public void setCreatedBy(Integer createdBy) { this.createdBy = createdBy; }
    public LocalDateTime getCreatedDate() { return createdDate; }
    public void setCreatedDate(LocalDateTime createdDate) { this.createdDate = createdDate; }
    public LocalDateTime getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(LocalDateTime updatedDate) { this.updatedDate = updatedDate; }
    public Integer getUpdatedBy() { return updatedBy; }
    public void setUpdatedBy(Integer updatedBy) { this.updatedBy = updatedBy; }
    public LocalDateTime getDeletedAt() { return deletedAt; }
    public void setDeletedAt(LocalDateTime deletedAt) { this.deletedAt = deletedAt; }
    public Integer getDeletedBy() { return deletedBy; }
    public void setDeletedBy(Integer deletedBy) { this.deletedBy = deletedBy; }
    public String getHsnCode() { return hsnCode; }
    public void setHsnCode(String hsnCode) { this.hsnCode = hsnCode; }
}
