package com.example.employee_management_api.service;

import java.util.List;
import com.example.employee_management_api.dto.EmployeeDTO;

public interface EmployeeService {

    EmployeeDTO create(EmployeeDTO dto);

    List<EmployeeDTO> getAll();

    EmployeeDTO getById(Long id);

    EmployeeDTO update(Long id, EmployeeDTO dto);

    void delete(Long id);

}