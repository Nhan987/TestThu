package com.luv2code.springboot.cruddemo.Service;

import com.luv2code.springboot.cruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.cruddemo.entitys.Employee;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
//    @Autowired
//    public EmployeeServiceImpl (EmployeeRepository theemployeeRepository){
//        employeeRepository = theemployeeRepository;
//    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);

        Employee theEmployee = null;

        if(result.isPresent()){
            theEmployee = result.get();
        }else{
            throw new RuntimeException("Employee id not found - "+ theId);
        }

        return theEmployee;
    }
    @Transactional
    @Override
    public Employee save(Employee employee) {
        Employee dbemployee = employeeRepository.save(employee);
        return dbemployee;
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}
