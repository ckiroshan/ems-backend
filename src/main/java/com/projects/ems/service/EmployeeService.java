package com.projects.ems.service;

import com.projects.ems.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto addEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);
}
