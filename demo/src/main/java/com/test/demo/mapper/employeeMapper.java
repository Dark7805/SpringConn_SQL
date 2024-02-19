package com.test.demo.mapper;

import com.test.demo.dto.employeeDto;
import com.test.demo.entity.employee;

public class employeeMapper {
    
    public static employeeDto mapToEmployeeDto(employee Employee){
           return new employeeDto(
            Employee.getId(),
            Employee.getName(),
            Employee.getPassword()
           );
    }

    public  static employee mapToEmployee(employeeDto empDto){
       return new employee(
        empDto.getId(),
        empDto.getName(),
        empDto.getPassword()
       );
    }
}
