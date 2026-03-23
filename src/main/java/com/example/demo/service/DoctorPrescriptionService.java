package com.example.demo.service;

import com.example.demo.dto.DoctorPrescriptionDto;
import com.example.demo.entity.DoctorPrescription;
import com.example.demo.repository.DoctorPrescriptionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DoctorPrescriptionService {
    private final DoctorPrescriptionRepository repo;

    public DoctorPrescriptionService(DoctorPrescriptionRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    public List<DoctorPrescriptionDto> findAll(){
        return repo.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<DoctorPrescriptionDto> findById(Integer id){
        return repo.findById(id).map(this::toDto);
    }

    @Transactional
    public DoctorPrescriptionDto create(DoctorPrescriptionDto dto){
        DoctorPrescription e = toEntity(dto);
        e = repo.save(e);
        return toDto(e);
    }

    @Transactional
    public Optional<DoctorPrescriptionDto> update(Integer id, DoctorPrescriptionDto dto){
        return repo.findById(id).map(existing -> {
            existing.setMstDoctorId(dto.getMstDoctorId());
            existing.setPatientCode(dto.getPatientCode());
            existing.setTrnVisitId(dto.getTrnVisitId());
            existing.setPrescriptionType(dto.getPrescriptionType());
            existing.setPrescriptionDate(dto.getPrescriptionDate());
            existing.setPaymode(dto.getPaymode());
            existing.setDeliveredTo(dto.getDeliveredTo());
            existing.setRoomNo(dto.getRoomNo());
            existing.setNurseName(dto.getNurseName());
            existing.setStatus(dto.getStatus());
            existing.setApprovalStatus(dto.getApprovalStatus());
            existing.setApprovedBy(dto.getApprovedBy());
            existing.setApprovedDate(dto.getApprovedDate());
            existing.setCreatedBy(dto.getCreatedBy());
            existing.setCreatedAt(dto.getCreatedAt());
            existing.setCreatedIp(dto.getCreatedIp());
            existing.setPrescribedBy(dto.getPrescribedBy());
            existing.setDoctorApproval(dto.getDoctorApproval());
            existing.setCostlyDrugApproval(dto.getCostlyDrugApproval());
            existing.setCostlyDrugApprovalStatus(dto.getCostlyDrugApprovalStatus());
            existing.setPrescribedDr(dto.getPrescribedDr());
            existing.setPrescribedDrId(dto.getPrescribedDrId());
            existing.setIsIcu(dto.getIsIcu());
            existing.setOtherClinician(dto.getOtherClinician());
            return toDto(repo.save(existing));
        });
    }

    @Transactional
    public void delete(Integer id){ repo.deleteById(id); }

    private DoctorPrescriptionDto toDto(DoctorPrescription e){
        DoctorPrescriptionDto d = new DoctorPrescriptionDto();
        d.setId(e.getId());
        d.setMstDoctorId(e.getMstDoctorId());
        d.setPatientCode(e.getPatientCode());
        d.setTrnVisitId(e.getTrnVisitId());
        d.setPrescriptionType(e.getPrescriptionType());
        d.setPrescriptionDate(e.getPrescriptionDate());
        d.setPaymode(e.getPaymode());
        d.setDeliveredTo(e.getDeliveredTo());
        d.setRoomNo(e.getRoomNo());
        d.setNurseName(e.getNurseName());
        d.setStatus(e.getStatus());
        d.setApprovalStatus(e.getApprovalStatus());
        d.setApprovedBy(e.getApprovedBy());
        d.setApprovedDate(e.getApprovedDate());
        d.setCreatedBy(e.getCreatedBy());
        d.setCreatedAt(e.getCreatedAt());
        d.setCreatedIp(e.getCreatedIp());
        d.setPrescribedBy(e.getPrescribedBy());
        d.setDoctorApproval(e.getDoctorApproval());
        d.setCostlyDrugApproval(e.getCostlyDrugApproval());
        d.setCostlyDrugApprovalStatus(e.getCostlyDrugApprovalStatus());
        d.setPrescribedDr(e.getPrescribedDr());
        d.setPrescribedDrId(e.getPrescribedDrId());
        d.setIsIcu(e.getIsIcu());
        d.setOtherClinician(e.getOtherClinician());
        return d;
    }

    private DoctorPrescription toEntity(DoctorPrescriptionDto d){
        DoctorPrescription e = new DoctorPrescription();
        e.setMstDoctorId(d.getMstDoctorId());
        e.setPatientCode(d.getPatientCode());
        e.setTrnVisitId(d.getTrnVisitId());
        e.setPrescriptionType(d.getPrescriptionType());
        e.setPrescriptionDate(d.getPrescriptionDate());
        e.setPaymode(d.getPaymode());
        e.setDeliveredTo(d.getDeliveredTo());
        e.setRoomNo(d.getRoomNo());
        e.setNurseName(d.getNurseName());
        e.setStatus(d.getStatus());
        e.setApprovalStatus(d.getApprovalStatus());
        e.setApprovedBy(d.getApprovedBy());
        e.setApprovedDate(d.getApprovedDate());
        e.setCreatedBy(d.getCreatedBy());
        e.setCreatedAt(d.getCreatedAt());
        e.setCreatedIp(d.getCreatedIp());
        e.setPrescribedBy(d.getPrescribedBy());
        e.setDoctorApproval(d.getDoctorApproval());
        e.setCostlyDrugApproval(d.getCostlyDrugApproval());
        e.setCostlyDrugApprovalStatus(d.getCostlyDrugApprovalStatus());
        e.setPrescribedDr(d.getPrescribedDr());
        e.setPrescribedDrId(d.getPrescribedDrId());
        e.setIsIcu(d.getIsIcu());
        e.setOtherClinician(d.getOtherClinician());
        return e;
    }
}
