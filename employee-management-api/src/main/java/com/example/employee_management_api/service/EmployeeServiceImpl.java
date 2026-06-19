package com.example.employee_management_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee_management_api.dto.EmployeeDTO;
import com.example.employee_management_api.entity.Employee;
import com.example.employee_management_api.exception.ResourceNotFoundException;
import com.example.employee_management_api.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {

        this.repository = repository;

    }

    @Override
    public EmployeeDTO create(EmployeeDTO dto) {

        Employee employee = new Employee();

        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setDepartment(dto.getDepartment());

        Employee saved = repository.save(employee);

        return convert(saved);

    }

    @Override
    public List<EmployeeDTO> getAll() {

        return repository.findAll()
                .stream()
                .map(this::convert)
                .toList();

    }

    @Override
    public EmployeeDTO getById(Long id) {

        Employee employee = repository.findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Employee not found"));

        return convert(employee);

    }

    @Override
    public EmployeeDTO update(Long id, EmployeeDTO dto) {

        Employee employee = repository.findById(id)
                .orElseThrow();

        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setDepartment(dto.getDepartment());

        return convert(repository.save(employee));

    }

    @Override
    public void delete(Long id) {

        repository.deleteById(id);

    }

    private EmployeeDTO convert(Employee employee) {

        EmployeeDTO dto = new EmployeeDTO();

        dto.setName(employee.getName());
        dto.setEmail(employee.getEmail());
        dto.setDepartment(employee.getDepartment());

        return dto;

    }

}