package com.test.demo.services;

import com.test.demo.dto.employeeDto;

public interface employeeService {
    employeeDto createEmployee(employeeDto empDto);
    employeeDto getEmployeeById(Long id);

}
