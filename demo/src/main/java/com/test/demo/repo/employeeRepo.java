package com.test.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demo.entity.employee;

public interface employeeRepo extends JpaRepository<employee,Long>{
    
}
