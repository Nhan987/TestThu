package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Poornima","Patel"));
        theStudents.add(new Student("Mail","bd"));
        theStudents.add(new Student("Moe Moe","load"));

    }

    @RequestMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }

    @RequestMapping("/students/{studentId}")
    public Student getStudents(@PathVariable int studentId){
        if((studentId >= theStudents.size() || studentId < 0)){
            throw new StudentNotFoundException("student Id not found _ " + studentId );
        }
        return theStudents.get(studentId);
    }



}
