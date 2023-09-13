package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entitys.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			//CreateStudent(studentDAO);
			//readStudent(studentDAO);
			//queryForStudent(studentDAO);
			DeleteAllStudent(studentDAO);
		};
	}

	private void DeleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Delete All Student");
		int numRows = studentDAO.deleteAll();
		System.out.println("Delete Rows count : " + numRows);
	}

	private void queryForStudent(StudentDAO studentDAO) {
		List<Student> studentList = studentDAO.findAll();
		for(Student student : studentList){
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("create");
		Student tmpstudent = new Student("Petter","Part","pettl@luv2code.com");

		System.out.println("save");
		studentDAO.save(tmpstudent);

		int theId = tmpstudent.getId();
		System.out.println("Saved student. Generated id: " + theId);

		System.out.println("Retrieving student with id: " + theId);

		Student myStudent =studentDAO.findById(theId);
		System.out.println("Found Student" + myStudent);
	}

	private void CreateStudent(StudentDAO studentDAO) {
		System.out.println("create");
		Student tmpstudent = new Student("Paul","DSoe","paul@luv2code.com");

		System.out.println("save");
		studentDAO.save(tmpstudent);

		System.out.println("Saved student. Generated id: " + tmpstudent.getId());

	}
}
