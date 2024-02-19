package com.test.demo.services.impl;

import org.springframework.stereotype.Service;

import com.test.demo.dto.employeeDto;
import com.test.demo.entity.employee;
import com.test.demo.exception.resourceNotFoundException;
import com.test.demo.mapper.employeeMapper;
import com.test.demo.repo.employeeRepo;
import com.test.demo.services.employeeService;



@Service
public class employeeServiceImpl implements employeeService {
   
private employeeRepo employeerepo;

public employeeServiceImpl(employeeRepo employeerepo) {
    this.employeerepo = employeerepo;
}

@Override
    public employeeDto createEmployee(employeeDto empDto) {
        // TODO Auto-generated method stub

        employee Employee=employeeMapper.mapToEmployee(empDto);
        employee savedEmployee=employeerepo.save(Employee);
       
        return employeeMapper.mapToEmployeeDto(savedEmployee);
    }

@Override
public employeeDto getEmployeeById(Long id) {
    // TODO Auto-generated method stub
   employee Employee= employeerepo.findById(id)
    .orElseThrow(() -> new resourceNotFoundException("Invalid id : "+ id));
    return employeeMapper.mapToEmployeeDto(Employee);
}
    
}
