package com.example.SpringBootAndH2JDBC.service;

import com.example.SpringBootAndH2JDBC.model.Student;
import com.example.SpringBootAndH2JDBC.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    StudentRepo repository;

    public StudentRepo getRepository() {
        return repository;
    }
@Autowired
    public void setRepository(StudentRepo repository) {
        this.repository = repository;
    }

    public void addStudent(Student s)
    {
//        System.out.println("Student added!"); we want repo to do this job
        repository.save(s);
    }

    public List<Student> getStudents() {

        return repository.findAll();
    }
}
