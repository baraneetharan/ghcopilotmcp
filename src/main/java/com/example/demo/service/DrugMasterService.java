package com.example.demo.service;

import com.example.demo.dto.DrugMasterDto;
import com.example.demo.entity.DrugMaster;
import com.example.demo.repository.DrugMasterRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DrugMasterService {
    private final DrugMasterRepository repo;

    public DrugMasterService(DrugMasterRepository repo) {
        this.repo = repo;
    }

    @Transactional(readOnly = true)
    public List<DrugMasterDto> findAll(){
        return repo.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<DrugMasterDto> findById(Integer id){
        return repo.findById(id).map(this::toDto);
    }

    @Transactional
    public DrugMasterDto create(DrugMasterDto dto){
        DrugMaster e = toEntity(dto);
        e = repo.save(e);
        return toDto(e);
    }

    @Transactional
    public Optional<DrugMasterDto> update(Integer id, DrugMasterDto dto){
        return repo.findById(id).map(existing -> {
            existing.setPharmacyDrugName(dto.getPharmacyDrugName());
            existing.setPresDrugId(dto.getPresDrugId());
            existing.setPresDrugName(dto.getPresDrugName());
            existing.setChemicalName(dto.getChemicalName());
            existing.setDrugChemicalName(dto.getDrugChemicalName());
            existing.setMedicalNonMedical(dto.getMedicalNonMedical());
            existing.setStatus(dto.getStatus());
            existing.setCreatedBy(dto.getCreatedBy());
            existing.setCreatedDate(dto.getCreatedDate());
            existing.setUpdatedDate(dto.getUpdatedDate());
            existing.setUpdatedBy(dto.getUpdatedBy());
            existing.setDeletedAt(dto.getDeletedAt());
            existing.setDeletedBy(dto.getDeletedBy());
            existing.setHsnCode(dto.getHsnCode());
            return toDto(repo.save(existing));
        });
    }

    @Transactional
    public void delete(Integer id){ repo.deleteById(id); }

    private DrugMasterDto toDto(DrugMaster e){
        DrugMasterDto d = new DrugMasterDto();
        d.setId(e.getId());
        d.setPharmacyDrugName(e.getPharmacyDrugName());
        d.setPresDrugId(e.getPresDrugId());
        d.setPresDrugName(e.getPresDrugName());
        d.setChemicalName(e.getChemicalName());
        d.setDrugChemicalName(e.getDrugChemicalName());
        d.setMedicalNonMedical(e.getMedicalNonMedical());
        d.setStatus(e.getStatus());
        d.setCreatedBy(e.getCreatedBy());
        d.setCreatedDate(e.getCreatedDate());
        d.setUpdatedDate(e.getUpdatedDate());
        d.setUpdatedBy(e.getUpdatedBy());
        d.setDeletedAt(e.getDeletedAt());
        d.setDeletedBy(e.getDeletedBy());
        d.setHsnCode(e.getHsnCode());
        return d;
    }

    private DrugMaster toEntity(DrugMasterDto d){
        DrugMaster e = new DrugMaster();
        e.setPharmacyDrugName(d.getPharmacyDrugName());
        e.setPresDrugId(d.getPresDrugId());
        e.setPresDrugName(d.getPresDrugName());
        e.setChemicalName(d.getChemicalName());
        e.setDrugChemicalName(d.getDrugChemicalName());
        e.setMedicalNonMedical(d.getMedicalNonMedical());
        e.setStatus(d.getStatus());
        e.setCreatedBy(d.getCreatedBy());
        e.setCreatedDate(d.getCreatedDate());
        e.setUpdatedDate(d.getUpdatedDate());
        e.setUpdatedBy(d.getUpdatedBy());
        e.setDeletedAt(d.getDeletedAt());
        e.setDeletedBy(d.getDeletedBy());
        e.setHsnCode(d.getHsnCode());
        return e;
    }
}
