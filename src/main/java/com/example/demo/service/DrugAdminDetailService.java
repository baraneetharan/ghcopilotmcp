package com.example.demo.service;

import com.example.demo.dto.DrugAdminDetailDto;
import com.example.demo.entity.DrugAdminDetail;
import com.example.demo.repository.DrugAdminDetailRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DrugAdminDetailService {
    private final DrugAdminDetailRepository repo;

    public DrugAdminDetailService(DrugAdminDetailRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    public List<DrugAdminDetailDto> findAll(){
        return repo.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<DrugAdminDetailDto> findById(Integer id){
        return repo.findById(id).map(this::toDto);
    }

    @Transactional
    public DrugAdminDetailDto create(DrugAdminDetailDto dto){
        DrugAdminDetail e = toEntity(dto);
        e = repo.save(e);
        return toDto(e);
    }

    @Transactional
    public Optional<DrugAdminDetailDto> update(Integer id, DrugAdminDetailDto dto){
        return repo.findById(id).map(existing -> {
            existing.setDrugQuantity(dto.getDrugQuantity());
            existing.setDrugGivenTime(dto.getDrugGivenTime());
            existing.setFrequency(dto.getFrequency());
            existing.setNurseName(dto.getNurseName());
            existing.setRemarks(dto.getRemarks());
            return toDto(repo.save(existing));
        });
    }

    @Transactional
    public void delete(Integer id){ repo.deleteById(id); }

    private DrugAdminDetailDto toDto(DrugAdminDetail e){
        DrugAdminDetailDto d = new DrugAdminDetailDto();
        d.setId(e.getId());
        d.setDrugAdminHeaderId(e.getDrugAdminHeaderId());
        d.setDrugId(e.getDrugId());
        d.setDrugQuantity(e.getDrugQuantity());
        d.setDrugGivenTime(e.getDrugGivenTime());
        d.setMstDoctorId(e.getMstDoctorId());
        d.setCreatedAt(e.getCreatedAt());
        d.setCreatedBy(e.getCreatedBy());
        d.setUpdatedAt(e.getUpdatedAt());
        d.setUpdatedBy(e.getUpdatedBy());
        d.setIsActive(e.getIsActive());
        d.setFrequency(e.getFrequency());
        d.setNurseId(e.getNurseId());
        d.setTrnVisitId(e.getTrnVisitId());
        d.setEntryDate(e.getEntryDate());
        d.setStatus(e.getStatus());
        d.setRemarks(e.getRemarks());
        d.setNurseName(e.getNurseName());
        return d;
    }

    private DrugAdminDetail toEntity(DrugAdminDetailDto d){
        DrugAdminDetail e = new DrugAdminDetail();
        e.setDrugAdminHeaderId(d.getDrugAdminHeaderId());
        e.setDrugId(d.getDrugId());
        e.setDrugQuantity(d.getDrugQuantity());
        e.setDrugGivenTime(d.getDrugGivenTime());
        e.setMstDoctorId(d.getMstDoctorId());
        e.setCreatedAt(d.getCreatedAt());
        e.setCreatedBy(d.getCreatedBy());
        e.setUpdatedAt(d.getUpdatedAt());
        e.setUpdatedBy(d.getUpdatedBy());
        e.setIsActive(d.getIsActive());
        e.setFrequency(d.getFrequency());
        e.setNurseId(d.getNurseId());
        e.setTrnVisitId(d.getTrnVisitId());
        e.setEntryDate(d.getEntryDate());
        e.setStatus(d.getStatus());
        e.setRemarks(d.getRemarks());
        e.setNurseName(d.getNurseName());
        return e;
    }
}
