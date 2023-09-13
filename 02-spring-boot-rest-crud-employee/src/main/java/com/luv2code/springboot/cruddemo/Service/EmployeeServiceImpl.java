package com.luv2code.springboot.cruddemo.Service;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entitys.Employee;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;
//    @Autowired
//    public EmployeeServiceImpl (EmployeeDAO theemployeeDAO){
//        employeeDAO = theemployeeDAO;
//    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Transactional
    @Override
    public Employee findById(int theId) {
        Employee employee =employeeDAO.findById(theId);
        return employee;
    }
    @Transactional
    @Override
    public Employee save(Employee employee) {
        Employee dbemployee = employeeDAO.save(employee);
        return dbemployee;
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDAO.deteleById(theId);
    }
}
