package com.example.SpringBootAndH2JDBC2.repository;

import com.example.SpringBootAndH2JDBC2.model.SRMStudent;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMap implements RowMapper<SRMStudent> {
    @Override
    public SRMStudent mapRow(ResultSet rs, int rowNum) throws SQLException {
        SRMStudent s2=new SRMStudent();
                s2.setRollNo(rs.getInt("rollno"));
                s2.setName(rs.getString("name"));
                s2.setAge(rs.getInt("age"));
                return s2;


    }
}
