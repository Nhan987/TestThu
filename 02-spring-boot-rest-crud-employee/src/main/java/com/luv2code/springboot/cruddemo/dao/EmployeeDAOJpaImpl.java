package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entitys.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{
    @Autowired
    private EntityManager entityManager;
//    @Autowired
//    public EmployeeDAOJpaImpl (EntityManager theEntityManager){
//        entityManager = theEntityManager;
//    }


    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int theId) {
        Employee employee = entityManager.find(Employee.class,theId);
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee dbemployee = entityManager.merge(employee);
        return dbemployee;
    }
    @Override
    public void deteleById(int theId) {
        Employee employee = entityManager.find(Employee.class,theId);
        entityManager.remove(employee);
    }


}
