package com.example.SpringBootAndH2JDBC;

import com.example.SpringBootAndH2JDBC.model.Student;
import com.example.SpringBootAndH2JDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootAndH2JdbcApplication {

	public static void main(String[] args)
	{   //Please consider it as client or Controller layer for now
		//We are using H2 DB which is an embedded DB so no extra connection needed
		//only when using external DB like postgres or mysql we need extra connection
		ApplicationContext context=SpringApplication.run(SpringBootAndH2JdbcApplication.class, args);
		Student s= context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Navin");
		s.setMarks(50);
		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student> stud= service.getStudents();
		//as we are trying to print object.. toString method in student class will be invoked
		System.out.println(stud);

	}

}
