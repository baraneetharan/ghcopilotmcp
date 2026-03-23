package com.example.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DoctorPrescriptionDto {
    private Integer id;
    private Integer mstDoctorId;
    private String patientCode;
    private Integer trnVisitId;
    private String prescriptionType;
    private LocalDate prescriptionDate;
    private Integer paymode;
    private String deliveredTo;
    private String roomNo;
    private String nurseName;
    private Integer status;
    private Integer approvalStatus;
    private Integer approvedBy;
    private LocalDateTime approvedDate;
    private Integer createdBy;
    private LocalDateTime createdAt;
    private String createdIp;
    private Integer prescribedBy;
    private Integer doctorApproval;
    private Integer costlyDrugApproval;
    private Integer costlyDrugApprovalStatus;
    private String prescribedDr;
    private Integer prescribedDrId;
    private Integer isIcu;
    private String otherClinician;

    public DoctorPrescriptionDto() {}
    // getters/setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getMstDoctorId() { return mstDoctorId; }
    public void setMstDoctorId(Integer mstDoctorId) { this.mstDoctorId = mstDoctorId; }
    public String getPatientCode() { return patientCode; }
    public void setPatientCode(String patientCode) { this.patientCode = patientCode; }
    public Integer getTrnVisitId() { return trnVisitId; }
    public void setTrnVisitId(Integer trnVisitId) { this.trnVisitId = trnVisitId; }
    public String getPrescriptionType() { return prescriptionType; }
    public void setPrescriptionType(String prescriptionType) { this.prescriptionType = prescriptionType; }
    public LocalDate getPrescriptionDate() { return prescriptionDate; }
    public void setPrescriptionDate(LocalDate prescriptionDate) { this.prescriptionDate = prescriptionDate; }
    public Integer getPaymode() { return paymode; }
    public void setPaymode(Integer paymode) { this.paymode = paymode; }
    public String getDeliveredTo() { return deliveredTo; }
    public void setDeliveredTo(String deliveredTo) { this.deliveredTo = deliveredTo; }
    public String getRoomNo() { return roomNo; }
    public void setRoomNo(String roomNo) { this.roomNo = roomNo; }
    public String getNurseName() { return nurseName; }
    public void setNurseName(String nurseName) { this.nurseName = nurseName; }
    public Integer getStatus() { return status; }
    public void setStatus(Integer status) { this.status = status; }
    public Integer getApprovalStatus() { return approvalStatus; }
    public void setApprovalStatus(Integer approvalStatus) { this.approvalStatus = approvalStatus; }
    public Integer getApprovedBy() { return approvedBy; }
    public void setApprovedBy(Integer approvedBy) { this.approvedBy = approvedBy; }
    public LocalDateTime getApprovedDate() { return approvedDate; }
    public void setApprovedDate(LocalDateTime approvedDate) { this.approvedDate = approvedDate; }
    public Integer getCreatedBy() { return createdBy; }
    public void setCreatedBy(Integer createdBy) { this.createdBy = createdBy; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public String getCreatedIp() { return createdIp; }
    public void setCreatedIp(String createdIp) { this.createdIp = createdIp; }
    public Integer getPrescribedBy() { return prescribedBy; }
    public void setPrescribedBy(Integer prescribedBy) { this.prescribedBy = prescribedBy; }
    public Integer getDoctorApproval() { return doctorApproval; }
    public void setDoctorApproval(Integer doctorApproval) { this.doctorApproval = doctorApproval; }
    public Integer getCostlyDrugApproval() { return costlyDrugApproval; }
    public void setCostlyDrugApproval(Integer costlyDrugApproval) { this.costlyDrugApproval = costlyDrugApproval; }
    public Integer getCostlyDrugApprovalStatus() { return costlyDrugApprovalStatus; }
    public void setCostlyDrugApprovalStatus(Integer costlyDrugApprovalStatus) { this.costlyDrugApprovalStatus = costlyDrugApprovalStatus; }
    public String getPrescribedDr() { return prescribedDr; }
    public void setPrescribedDr(String prescribedDr) { this.prescribedDr = prescribedDr; }
    public Integer getPrescribedDrId() { return prescribedDrId; }
    public void setPrescribedDrId(Integer prescribedDrId) { this.prescribedDrId = prescribedDrId; }
    public Integer getIsIcu() { return isIcu; }
    public void setIsIcu(Integer isIcu) { this.isIcu = isIcu; }
    public String getOtherClinician() { return otherClinician; }
    public void setOtherClinician(String otherClinician) { this.otherClinician = otherClinician; }
}
