package com.example.demo.service;

import com.example.demo.dto.NurseDto;
import com.example.demo.entity.Nurse;
import com.example.demo.repository.NurseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NurseService {

    private final NurseRepository nurseRepository;

    public NurseService(NurseRepository nurseRepository) {
        this.nurseRepository = nurseRepository;
    }

    @Transactional(readOnly = true)
    public List<NurseDto> findAll() {
        return nurseRepository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public NurseDto findById(Integer id) {
        return nurseRepository.findById(id).map(this::toDto).orElse(null);
    }

    @Transactional
    public NurseDto create(NurseDto dto) {
        Nurse entity = toEntity(dto);
        entity.setId(null);
        Nurse saved = nurseRepository.save(entity);
        return toDto(saved);
    }

    @Transactional
    public NurseDto update(Integer id, NurseDto dto) {
        return nurseRepository.findById(id).map(existing -> {
            existing.setName(dto.getName());
            existing.setEmail(dto.getEmail());
            existing.setDepartment(dto.getDepartment());
            existing.setIsActive(dto.getIsActive());
            Nurse saved = nurseRepository.save(existing);
            return toDto(saved);
        }).orElse(null);
    }

    @Transactional
    public void delete(Integer id) {
        nurseRepository.deleteById(id);
    }

    private NurseDto toDto(Nurse n) {
        NurseDto d = new NurseDto();
        d.setId(n.getId());
        d.setName(n.getName());
        d.setEmail(n.getEmail());
        d.setDepartment(n.getDepartment());
        d.setIsActive(n.getIsActive());
        return d;
    }

    private Nurse toEntity(NurseDto d) {
        Nurse n = new Nurse();
        n.setId(d.getId());
        n.setName(d.getName());
        n.setEmail(d.getEmail());
        n.setDepartment(d.getDepartment());
        n.setIsActive(d.getIsActive());
        return n;
    }
}
