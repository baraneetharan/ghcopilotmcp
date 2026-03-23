package com.example.demo.dto;

import java.time.LocalDateTime;

public class DrugAdminDetailDto {
    private Integer id;
    private Integer drugAdminHeaderId;
    private Integer drugId;
    private String drugQuantity;
    private LocalDateTime drugGivenTime;
    private Integer mstDoctorId;
    private LocalDateTime createdAt;
    private Integer createdBy;
    private LocalDateTime updatedAt;
    private Integer updatedBy;
    private Integer isActive;
    private String frequency;
    private Integer nurseId;
    private Integer trnVisitId;
    private LocalDateTime entryDate;
    private String status;
    private String remarks;
    private String nurseName;
    private LocalDateTime nextDoseGiven;
    private Integer drugPeriodHours;
    private Integer drugHoursBasedFlag;
    private String timeNeedGiven;
    private Integer nurseId2;
    private String nurseName2;
    private Integer isHighriskMedicine;
    private Integer isVerbalOrder;
    private Integer adminFreqUnits;
    private Integer freqBloodSugarLevel;
    private Integer isTestdose;

    public DrugAdminDetailDto() {}
    // getters/setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getDrugAdminHeaderId() { return drugAdminHeaderId; }
    public void setDrugAdminHeaderId(Integer drugAdminHeaderId) { this.drugAdminHeaderId = drugAdminHeaderId; }
    public Integer getDrugId() { return drugId; }
    public void setDrugId(Integer drugId) { this.drugId = drugId; }
    public String getDrugQuantity() { return drugQuantity; }
    public void setDrugQuantity(String drugQuantity) { this.drugQuantity = drugQuantity; }
    public LocalDateTime getDrugGivenTime() { return drugGivenTime; }
    public void setDrugGivenTime(LocalDateTime drugGivenTime) { this.drugGivenTime = drugGivenTime; }
    public Integer getMstDoctorId() { return mstDoctorId; }
    public void setMstDoctorId(Integer mstDoctorId) { this.mstDoctorId = mstDoctorId; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public Integer getCreatedBy() { return createdBy; }
    public void setCreatedBy(Integer createdBy) { this.createdBy = createdBy; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public Integer getUpdatedBy() { return updatedBy; }
    public void setUpdatedBy(Integer updatedBy) { this.updatedBy = updatedBy; }
    public Integer getIsActive() { return isActive; }
    public void setIsActive(Integer isActive) { this.isActive = isActive; }
    public String getFrequency() { return frequency; }
    public void setFrequency(String frequency) { this.frequency = frequency; }
    public Integer getNurseId() { return nurseId; }
    public void setNurseId(Integer nurseId) { this.nurseId = nurseId; }
    public Integer getTrnVisitId() { return trnVisitId; }
    public void setTrnVisitId(Integer trnVisitId) { this.trnVisitId = trnVisitId; }
    public LocalDateTime getEntryDate() { return entryDate; }
    public void setEntryDate(LocalDateTime entryDate) { this.entryDate = entryDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
    public String getNurseName() { return nurseName; }
    public void setNurseName(String nurseName) { this.nurseName = nurseName; }
    public LocalDateTime getNextDoseGiven() { return nextDoseGiven; }
    public void setNextDoseGiven(LocalDateTime nextDoseGiven) { this.nextDoseGiven = nextDoseGiven; }
    public Integer getDrugPeriodHours() { return drugPeriodHours; }
    public void setDrugPeriodHours(Integer drugPeriodHours) { this.drugPeriodHours = drugPeriodHours; }
    public Integer getDrugHoursBasedFlag() { return drugHoursBasedFlag; }
    public void setDrugHoursBasedFlag(Integer drugHoursBasedFlag) { this.drugHoursBasedFlag = drugHoursBasedFlag; }
    public String getTimeNeedGiven() { return timeNeedGiven; }
    public void setTimeNeedGiven(String timeNeedGiven) { this.timeNeedGiven = timeNeedGiven; }
    public Integer getNurseId2() { return nurseId2; }
    public void setNurseId2(Integer nurseId2) { this.nurseId2 = nurseId2; }
    public String getNurseName2() { return nurseName2; }
    public void setNurseName2(String nurseName2) { this.nurseName2 = nurseName2; }
    public Integer getIsHighriskMedicine() { return isHighriskMedicine; }
    public void setIsHighriskMedicine(Integer isHighriskMedicine) { this.isHighriskMedicine = isHighriskMedicine; }
    public Integer getIsVerbalOrder() { return isVerbalOrder; }
    public void setIsVerbalOrder(Integer isVerbalOrder) { this.isVerbalOrder = isVerbalOrder; }
    public Integer getAdminFreqUnits() { return adminFreqUnits; }
    public void setAdminFreqUnits(Integer adminFreqUnits) { this.adminFreqUnits = adminFreqUnits; }
    public Integer getFreqBloodSugarLevel() { return freqBloodSugarLevel; }
    public void setFreqBloodSugarLevel(Integer freqBloodSugarLevel) { this.freqBloodSugarLevel = freqBloodSugarLevel; }
    public Integer getIsTestdose() { return isTestdose; }
    public void setIsTestdose(Integer isTestdose) { this.isTestdose = isTestdose; }
}
