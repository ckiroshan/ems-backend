package com.projects.ems.service.impl;

import com.projects.ems.dto.EmployeeDto;
import com.projects.ems.entity.Employee;
import com.projects.ems.mapper.EmployeeMapper;
import com.projects.ems.repository.EmployeeRepository;
import com.projects.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    // Dependencies
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        // Convert EmployeeDto to Employee entity
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        // Convert Employee entity to EmployeeDto
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
