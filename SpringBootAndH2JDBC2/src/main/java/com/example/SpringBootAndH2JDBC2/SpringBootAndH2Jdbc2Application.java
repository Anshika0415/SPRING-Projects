package com.example.SpringBootAndH2JDBC2;

import com.example.SpringBootAndH2JDBC2.model.SRMStudent;
import com.example.SpringBootAndH2JDBC2.repository.StudentRepo;
import com.example.SpringBootAndH2JDBC2.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootAndH2Jdbc2Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringBootAndH2Jdbc2Application.class, args);
		SRMStudent s1=context.getBean(SRMStudent.class);
		SRMStudent s3=context.getBean(SRMStudent.class);
		StudentService serv=context.getBean(StudentService.class);

		s1.setRollNo(101);
		s1.setName("Arshdeep");
		s1.setAge(22);
		serv.save(s1);
		s3.setRollNo(102);
		s3.setName("Anshika");
		s3.setAge(23);
		serv.save(s3);
		List<SRMStudent> srmStudentList=new ArrayList<>();
		srmStudentList=serv.retriveData();
		System.out.println(srmStudentList);

	}

}
