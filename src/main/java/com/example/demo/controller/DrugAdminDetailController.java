package com.example.demo.controller;

import com.example.demo.dto.DrugAdminDetailDto;
import com.example.demo.service.DrugAdminDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drug-admins")
public class DrugAdminDetailController {
    private final DrugAdminDetailService service;

    public DrugAdminDetailController(DrugAdminDetailService service) { this.service = service; }

    @GetMapping
    public List<DrugAdminDetailDto> list(){ return service.findAll(); }

    @GetMapping("/{id}")
    public DrugAdminDetailDto get(@PathVariable Integer id){ return service.findById(id).orElse(null); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DrugAdminDetailDto create(@RequestBody DrugAdminDetailDto dto){ return service.create(dto); }

    @PutMapping("/{id}")
    public DrugAdminDetailDto update(@PathVariable Integer id, @RequestBody DrugAdminDetailDto dto){
        return service.update(id, dto).orElse(null);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){ service.delete(id); }
}
