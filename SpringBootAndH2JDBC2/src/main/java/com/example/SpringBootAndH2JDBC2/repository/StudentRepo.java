package com.example.SpringBootAndH2JDBC2.repository;

import com.example.SpringBootAndH2JDBC2.model.SRMStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    @Autowired
    JdbcTemplate jdbc;
    public void addStudent(SRMStudent s1) {
        String sql="insert into SrmStudent(rollno,name,age) values(?,?,?)";
        int row=jdbc.update(sql,s1.getRollNo(),s1.getName(),s1.getAge());
        System.out.println(row+" effected");
    }

    public List<SRMStudent> getAll() {
        String sql="Select * from SrmStudent";

        RowMapper<SRMStudent> mapper=new RowMap();
        List<SRMStudent> emp=jdbc.query(sql,mapper);
        return emp;
    }
}
