package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entitys.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    int deleteAll();
}
