package com.example.demo.controller;

import com.example.demo.dto.DoctorPrescriptionDto;
import com.example.demo.service.DoctorPrescriptionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prescriptions")
public class DoctorPrescriptionController {
    private final DoctorPrescriptionService service;

    public DoctorPrescriptionController(DoctorPrescriptionService service) { this.service = service; }

    @GetMapping
    public List<DoctorPrescriptionDto> list(){ return service.findAll(); }

    @GetMapping("/{id}")
    public DoctorPrescriptionDto get(@PathVariable Integer id){ return service.findById(id).orElse(null); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DoctorPrescriptionDto create(@RequestBody DoctorPrescriptionDto dto){ return service.create(dto); }

    @PutMapping("/{id}")
    public DoctorPrescriptionDto update(@PathVariable Integer id, @RequestBody DoctorPrescriptionDto dto){
        return service.update(id, dto).orElse(null);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){ service.delete(id); }
}
