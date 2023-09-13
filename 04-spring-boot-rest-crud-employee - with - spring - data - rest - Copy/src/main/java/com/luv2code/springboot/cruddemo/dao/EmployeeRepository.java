package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entitys.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
