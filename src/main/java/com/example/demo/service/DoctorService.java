package com.example.demo.service;

import com.example.demo.dto.DoctorDto;
import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Transactional(readOnly = true)
    public List<DoctorDto> findAll() {
        return doctorRepository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public DoctorDto findById(Integer id) {
        return doctorRepository.findById(id).map(this::toDto).orElse(null);
    }

    @Transactional
    public DoctorDto create(DoctorDto dto) {
        Doctor entity = toEntity(dto);
        entity.setId(null);
        Doctor saved = doctorRepository.save(entity);
        return toDto(saved);
    }

    @Transactional
    public DoctorDto update(Integer id, DoctorDto dto) {
        return doctorRepository.findById(id).map(existing -> {
            existing.setName(dto.getName());
            existing.setEmail(dto.getEmail());
            existing.setSpecialisation(dto.getSpecialisation());
            existing.setIsActive(dto.getIsActive());
            Doctor saved = doctorRepository.save(existing);
            return toDto(saved);
        }).orElse(null);
    }

    @Transactional
    public void delete(Integer id) {
        doctorRepository.deleteById(id);
    }

    private DoctorDto toDto(Doctor d) {
        DoctorDto dto = new DoctorDto();
        dto.setId(d.getId());
        dto.setName(d.getName());
        dto.setEmail(d.getEmail());
        dto.setSpecialisation(d.getSpecialisation());
        dto.setIsActive(d.getIsActive());
        return dto;
    }

    private Doctor toEntity(DoctorDto dto) {
        Doctor d = new Doctor();
        d.setId(dto.getId());
        d.setName(dto.getName());
        d.setEmail(dto.getEmail());
        d.setSpecialisation(dto.getSpecialisation());
        d.setIsActive(dto.getIsActive());
        return d;
    }
}
