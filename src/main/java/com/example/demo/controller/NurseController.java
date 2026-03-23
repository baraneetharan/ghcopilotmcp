package com.example.demo.controller;

import com.example.demo.dto.NurseDto;
import com.example.demo.service.NurseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nurses")
public class NurseController {

    private final NurseService nurseService;

    public NurseController(NurseService nurseService) {
        this.nurseService = nurseService;
    }

    @GetMapping
    public List<NurseDto> getAll() {
        return nurseService.findAll();
    }

    @GetMapping("/{id}")
    public NurseDto getById(@PathVariable Integer id) {
        return nurseService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public NurseDto create(@RequestBody NurseDto dto) {
        return nurseService.create(dto);
    }

    @PutMapping("/{id}")
    public NurseDto update(@PathVariable Integer id, @RequestBody NurseDto dto) {
        return nurseService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        nurseService.delete(id);
    }
}
