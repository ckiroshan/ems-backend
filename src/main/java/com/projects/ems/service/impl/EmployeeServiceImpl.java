package com.projects.ems.service.impl;

import com.projects.ems.dto.EmployeeDto;
import com.projects.ems.entity.Employee;
import com.projects.ems.exception.ResourceNotFoundException;
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

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee with ID " + employeeId + " does not exist"));
        // Convert Employee entity to EmployeeDto
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
