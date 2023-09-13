package com.luv2code.springboot.cruddemo.Service;

import com.luv2code.springboot.cruddemo.entitys.Employee;

import java.util.List;

public interface EmployeeService  {

    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee employee);
    void deleteById(int theId);
}
