package com.example.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DoctorPrescriptionDetailDto {
    private Integer id;
    private Integer trnPrescriptionId;
    private String itemCode;
    private Integer isCostlyDrug;
    private String costlyDrugExceedRemark;
    private String itemName;
    private String dosage;
    private String quantity;
    private String frequency;
    private String route;
    private String duration;
    private String durationUnit;
    private String intake;
    private String remarks;
    private LocalDate stopDate;
    private Integer status;
    private Integer paymode;
    private Integer prescribedBy;
    private Integer doctorApproval;
    private String prescribedDr;
    private String doctorStatusRemarks;
    private String doctorApprovalStatus;
    private String doctorRejectRemark;
    private String doctorPendingRemark;
    private LocalDateTime updatedDate;
    private Integer isOrdered;
    private LocalDateTime ipStopDate;
    private Integer isVerbalOrder;
    private Integer isStopCheck;
    private String ivFusion;
    private String ipDrugType;
    private String intakePeriod;
    private Integer isHighriskMedicine;
    private String freqUnits;
    private String justificationAntibiotic;
    private Integer antibioticFreq;
    private String antibioticFreqSolution;
    private String antibioticFreqSolutionName;
    private LocalDateTime startDate;
    private Integer isTestdose;
    private Integer justificationAntibioticQty;
    private Integer isPremedication;
    private Integer isSurgicalProphylaxis;
    private String cultureSent;
    private String justificationReason;
    private String stopRemarks;

    public DoctorPrescriptionDetailDto() {}
    // getters/setters omitted for brevity in patch
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getTrnPrescriptionId() { return trnPrescriptionId; }
    public void setTrnPrescriptionId(Integer trnPrescriptionId) { this.trnPrescriptionId = trnPrescriptionId; }
    public String getItemCode() { return itemCode; }
    public void setItemCode(String itemCode) { this.itemCode = itemCode; }
    public Integer getIsCostlyDrug() { return isCostlyDrug; }
    public void setIsCostlyDrug(Integer isCostlyDrug) { this.isCostlyDrug = isCostlyDrug; }
    public String getCostlyDrugExceedRemark() { return costlyDrugExceedRemark; }
    public void setCostlyDrugExceedRemark(String costlyDrugExceedRemark) { this.costlyDrugExceedRemark = costlyDrugExceedRemark; }
    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public String getDosage() { return dosage; }
    public void setDosage(String dosage) { this.dosage = dosage; }
    public String getQuantity() { return quantity; }
    public void setQuantity(String quantity) { this.quantity = quantity; }
    public String getFrequency() { return frequency; }
    public void setFrequency(String frequency) { this.frequency = frequency; }
    public String getRoute() { return route; }
    public void setRoute(String route) { this.route = route; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
    public String getDurationUnit() { return durationUnit; }
    public void setDurationUnit(String durationUnit) { this.durationUnit = durationUnit; }
    public String getIntake() { return intake; }
    public void setIntake(String intake) { this.intake = intake; }
    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
    public LocalDate getStopDate() { return stopDate; }
    public void setStopDate(LocalDate stopDate) { this.stopDate = stopDate; }
    public Integer getStatus() { return status; }
    public void setStatus(Integer status) { this.status = status; }
    public Integer getPaymode() { return paymode; }
    public void setPaymode(Integer paymode) { this.paymode = paymode; }
    public Integer getPrescribedBy() { return prescribedBy; }
    public void setPrescribedBy(Integer prescribedBy) { this.prescribedBy = prescribedBy; }
    public Integer getDoctorApproval() { return doctorApproval; }
    public void setDoctorApproval(Integer doctorApproval) { this.doctorApproval = doctorApproval; }
    public String getPrescribedDr() { return prescribedDr; }
    public void setPrescribedDr(String prescribedDr) { this.prescribedDr = prescribedDr; }
    public String getDoctorStatusRemarks() { return doctorStatusRemarks; }
    public void setDoctorStatusRemarks(String doctorStatusRemarks) { this.doctorStatusRemarks = doctorStatusRemarks; }
    public String getDoctorApprovalStatus() { return doctorApprovalStatus; }
    public void setDoctorApprovalStatus(String doctorApprovalStatus) { this.doctorApprovalStatus = doctorApprovalStatus; }
    public String getDoctorRejectRemark() { return doctorRejectRemark; }
    public void setDoctorRejectRemark(String doctorRejectRemark) { this.doctorRejectRemark = doctorRejectRemark; }
    public String getDoctorPendingRemark() { return doctorPendingRemark; }
    public void setDoctorPendingRemark(String doctorPendingRemark) { this.doctorPendingRemark = doctorPendingRemark; }
    public LocalDateTime getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(LocalDateTime updatedDate) { this.updatedDate = updatedDate; }
    public Integer getIsOrdered() { return isOrdered; }
    public void setIsOrdered(Integer isOrdered) { this.isOrdered = isOrdered; }
    public LocalDateTime getIpStopDate() { return ipStopDate; }
    public void setIpStopDate(LocalDateTime ipStopDate) { this.ipStopDate = ipStopDate; }
    public Integer getIsVerbalOrder() { return isVerbalOrder; }
    public void setIsVerbalOrder(Integer isVerbalOrder) { this.isVerbalOrder = isVerbalOrder; }
    public Integer getIsStopCheck() { return isStopCheck; }
    public void setIsStopCheck(Integer isStopCheck) { this.isStopCheck = isStopCheck; }
    public String getIvFusion() { return ivFusion; }
    public void setIvFusion(String ivFusion) { this.ivFusion = ivFusion; }
    public String getIpDrugType() { return ipDrugType; }
    public void setIpDrugType(String ipDrugType) { this.ipDrugType = ipDrugType; }
    public String getIntakePeriod() { return intakePeriod; }
    public void setIntakePeriod(String intakePeriod) { this.intakePeriod = intakePeriod; }
    public Integer getIsHighriskMedicine() { return isHighriskMedicine; }
    public void setIsHighriskMedicine(Integer isHighriskMedicine) { this.isHighriskMedicine = isHighriskMedicine; }
    public String getFreqUnits() { return freqUnits; }
    public void setFreqUnits(String freqUnits) { this.freqUnits = freqUnits; }
    public String getJustificationAntibiotic() { return justificationAntibiotic; }
    public void setJustificationAntibiotic(String justificationAntibiotic) { this.justificationAntibiotic = justificationAntibiotic; }
    public Integer getAntibioticFreq() { return antibioticFreq; }
    public void setAntibioticFreq(Integer antibioticFreq) { this.antibioticFreq = antibioticFreq; }
    public String getAntibioticFreqSolution() { return antibioticFreqSolution; }
    public void setAntibioticFreqSolution(String antibioticFreqSolution) { this.antibioticFreqSolution = antibioticFreqSolution; }
    public String getAntibioticFreqSolutionName() { return antibioticFreqSolutionName; }
    public void setAntibioticFreqSolutionName(String antibioticFreqSolutionName) { this.antibioticFreqSolutionName = antibioticFreqSolutionName; }
    public LocalDateTime getStartDate() { return startDate; }
    public void setStartDate(LocalDateTime startDate) { this.startDate = startDate; }
    public Integer getIsTestdose() { return isTestdose; }
    public void setIsTestdose(Integer isTestdose) { this.isTestdose = isTestdose; }
    public Integer getJustificationAntibioticQty() { return justificationAntibioticQty; }
    public void setJustificationAntibioticQty(Integer justificationAntibioticQty) { this.justificationAntibioticQty = justificationAntibioticQty; }
    public Integer getIsPremedication() { return isPremedication; }
    public void setIsPremedication(Integer isPremedication) { this.isPremedication = isPremedication; }
    public Integer getIsSurgicalProphylaxis() { return isSurgicalProphylaxis; }
    public void setIsSurgicalProphylaxis(Integer isSurgicalProphylaxis) { this.isSurgicalProphylaxis = isSurgicalProphylaxis; }
    public String getCultureSent() { return cultureSent; }
    public void setCultureSent(String cultureSent) { this.cultureSent = cultureSent; }
    public String getJustificationReason() { return justificationReason; }
    public void setJustificationReason(String justificationReason) { this.justificationReason = justificationReason; }
    public String getStopRemarks() { return stopRemarks; }
    public void setStopRemarks(String stopRemarks) { this.stopRemarks = stopRemarks; }
}
