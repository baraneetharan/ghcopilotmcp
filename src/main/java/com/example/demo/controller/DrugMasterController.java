package com.example.demo.controller;

import com.example.demo.dto.DrugMasterDto;
import com.example.demo.service.DrugMasterService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drugs")
public class DrugMasterController {
    private final DrugMasterService service;

    public DrugMasterController(DrugMasterService service) {
        this.service = service;
    }

    @GetMapping
    public List<DrugMasterDto> list() { return service.findAll(); }

    @GetMapping("/{id}")
    public DrugMasterDto get(@PathVariable Integer id) { return service.findById(id).orElse(null); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DrugMasterDto create(@RequestBody DrugMasterDto dto) { return service.create(dto); }

    @PutMapping("/{id}")
    public DrugMasterDto update(@PathVariable Integer id, @RequestBody DrugMasterDto dto) {
        return service.update(id, dto).orElse(null);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) { service.delete(id); }
}
