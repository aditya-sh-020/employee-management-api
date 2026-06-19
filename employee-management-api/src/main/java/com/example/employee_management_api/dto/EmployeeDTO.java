package com.example.employee_management_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmployeeDTO {

    @NotBlank
    private String name;

    @Email
    private String email;

    @NotBlank
    private String department;

}