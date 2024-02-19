package com.test.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.dto.employeeDto;
import com.test.demo.services.employeeService;

@RestController
@RequestMapping("/api/employees")
public class employeeController {
     private employeeService employeeservice;

    public employeeController(employeeService employeeservice) {
        this.employeeservice = employeeservice;
    }
     @PostMapping
    public ResponseEntity<employeeDto>createEmployee(@RequestBody employeeDto empDto){
     employeeDto savedEmployee=  employeeservice.createEmployee(empDto);
     return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);

    }


    @GetMapping("{id}")    
    public ResponseEntity<employeeDto>getEmployeeById( @PathVariable("id") Long id){
       employeeDto employeedto= employeeservice.getEmployeeById(id);
       return ResponseEntity.ok(employeedto);
    }
}
