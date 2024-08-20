package com.example.SpringBootAndH2JDBC2.service;

import com.example.SpringBootAndH2JDBC2.model.SRMStudent;
import com.example.SpringBootAndH2JDBC2.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
@Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void save(SRMStudent s1) {
        repo.addStudent(s1);
    }

    public List<SRMStudent> retriveData() {
       return repo.getAll();
    }
}
