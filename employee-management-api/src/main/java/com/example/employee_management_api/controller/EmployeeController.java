package com.example.employee_management_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.example.employee_management_api.dto.EmployeeDTO;
import com.example.employee_management_api.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {

        this.service = service;

    }

    @PostMapping
    public EmployeeDTO create(
            @Valid @RequestBody EmployeeDTO dto) {

        return service.create(dto);

    }

    @GetMapping
    public List<EmployeeDTO> getAll() {

        return service.getAll();

    }

    @GetMapping("/{id}")
    public EmployeeDTO getById(
            @PathVariable Long id) {

        return service.getById(id);

    }

    @PutMapping("/{id}")
    public EmployeeDTO update(
            @PathVariable Long id,
            @RequestBody EmployeeDTO dto) {

        return service.update(id, dto);

    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.delete(id);

        return "Employee Deleted Successfully";

    }

}