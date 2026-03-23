package com.example.demo.service;

import com.example.demo.dto.DoctorPrescriptionDetailDto;
import com.example.demo.entity.DoctorPrescriptionDetail;
import com.example.demo.repository.DoctorPrescriptionDetailRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DoctorPrescriptionDetailService {
    private final DoctorPrescriptionDetailRepository repo;

    public DoctorPrescriptionDetailService(DoctorPrescriptionDetailRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    public List<DoctorPrescriptionDetailDto> findAll(){
        return repo.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<DoctorPrescriptionDetailDto> findById(Integer id){
        return repo.findById(id).map(this::toDto);
    }

    @Transactional
    public DoctorPrescriptionDetailDto create(DoctorPrescriptionDetailDto dto){
        DoctorPrescriptionDetail e = toEntity(dto);
        e = repo.save(e);
        return toDto(e);
    }

    @Transactional
    public Optional<DoctorPrescriptionDetailDto> update(Integer id, DoctorPrescriptionDetailDto dto){
        return repo.findById(id).map(existing -> {
            // copy a subset of fields for brevity
            existing.setItemCode(dto.getItemCode());
            existing.setItemName(dto.getItemName());
            existing.setDosage(dto.getDosage());
            existing.setQuantity(dto.getQuantity());
            existing.setFrequency(dto.getFrequency());
            existing.setRoute(dto.getRoute());
            existing.setDuration(dto.getDuration());
            existing.setRemarks(dto.getRemarks());
            return toDto(repo.save(existing));
        });
    }

    @Transactional
    public void delete(Integer id){ repo.deleteById(id); }

    private DoctorPrescriptionDetailDto toDto(DoctorPrescriptionDetail e){
        DoctorPrescriptionDetailDto d = new DoctorPrescriptionDetailDto();
        d.setId(e.getId());
        d.setTrnPrescriptionId(e.getTrnPrescriptionId());
        d.setItemCode(e.getItemCode());
        d.setIsCostlyDrug(e.getIsCostlyDrug());
        d.setCostlyDrugExceedRemark(e.getCostlyDrugExceedRemark());
        d.setItemName(e.getItemName());
        d.setDosage(e.getDosage());
        d.setQuantity(e.getQuantity());
        d.setFrequency(e.getFrequency());
        d.setRoute(e.getRoute());
        d.setDuration(e.getDuration());
        d.setDurationUnit(e.getDurationUnit());
        d.setIntake(e.getIntake());
        d.setRemarks(e.getRemarks());
        d.setStopDate(e.getStopDate());
        d.setStatus(e.getStatus());
        return d;
    }

    private DoctorPrescriptionDetail toEntity(DoctorPrescriptionDetailDto d){
        DoctorPrescriptionDetail e = new DoctorPrescriptionDetail();
        e.setTrnPrescriptionId(d.getTrnPrescriptionId());
        e.setItemCode(d.getItemCode());
        e.setIsCostlyDrug(d.getIsCostlyDrug());
        e.setCostlyDrugExceedRemark(d.getCostlyDrugExceedRemark());
        e.setItemName(d.getItemName());
        e.setDosage(d.getDosage());
        e.setQuantity(d.getQuantity());
        e.setFrequency(d.getFrequency());
        e.setRoute(d.getRoute());
        e.setDuration(d.getDuration());
        e.setDurationUnit(d.getDurationUnit());
        e.setIntake(d.getIntake());
        e.setRemarks(d.getRemarks());
        e.setStopDate(d.getStopDate());
        e.setStatus(d.getStatus());
        return e;
    }
}
