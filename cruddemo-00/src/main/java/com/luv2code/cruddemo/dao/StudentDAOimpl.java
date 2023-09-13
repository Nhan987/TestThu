package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entitys.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOimpl implements StudentDAO{

    private EntityManager entityManager;
    @Autowired
    public StudentDAOimpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Student theStudent) {
      entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public int deleteAll() {
        int numRowsDelete = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numRowsDelete;
    }
}
