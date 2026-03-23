package com.example.demo.controller;

import com.example.demo.dto.DoctorPrescriptionDetailDto;
import com.example.demo.service.DoctorPrescriptionDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prescription-details")
public class DoctorPrescriptionDetailController {
    private final DoctorPrescriptionDetailService service;

    public DoctorPrescriptionDetailController(DoctorPrescriptionDetailService service) { this.service = service; }

    @GetMapping
    public List<DoctorPrescriptionDetailDto> list(){ return service.findAll(); }

    @GetMapping("/{id}")
    public DoctorPrescriptionDetailDto get(@PathVariable Integer id){ return service.findById(id).orElse(null); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DoctorPrescriptionDetailDto create(@RequestBody DoctorPrescriptionDetailDto dto){ return service.create(dto); }

    @PutMapping("/{id}")
    public DoctorPrescriptionDetailDto update(@PathVariable Integer id, @RequestBody DoctorPrescriptionDetailDto dto){
        return service.update(id, dto).orElse(null);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){ service.delete(id); }
}
