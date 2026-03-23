package com.example.demo.controller;

import com.example.demo.dto.DoctorDto;
import com.example.demo.service.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<DoctorDto> getAll() {
        return doctorService.findAll();
    }

    @GetMapping("/{id}")
    public DoctorDto getById(@PathVariable Integer id) {
        return doctorService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DoctorDto create(@RequestBody DoctorDto dto) {
        return doctorService.create(dto);
    }

    @PutMapping("/{id}")
    public DoctorDto update(@PathVariable Integer id, @RequestBody DoctorDto dto) {
        return doctorService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        doctorService.delete(id);
    }
}
