package com.example.SpringBootAndH2JDBC.repository;

import com.example.SpringBootAndH2JDBC.model.Student;
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
    JdbcTemplate jdbc;
    public JdbcTemplate getJdbc() {
        return jdbc;
    }
@Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    public void save(Student s) {
        String sql="insert into student(rollno,name,marks) values (?,?,?)";
        int rows=jdbc.update(sql,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(rows +" effected");

    }

    public List<Student> findAll() {
        String sql="Select * from student";
        //Anonymous inner class no lambda expression for functional interface RowMapper(interface with one abs method)

//        RowMapper<Student> mapper= new RowMapper<Student>()
//        {
//
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student s=new Student();
//                s.setRollNo(rs.getInt("rollno"));
//                s.setName(rs.getString("name"));
//                s.setMarks(rs.getInt("marks"));
//                return s;
//            }
//        };
//        return jdbc.query(sql,mapper);

//        RowMapper<Student> mapper= ( rs,rowNum)->
//            {   Student s=new Student();
//                s.setRollNo(rs.getInt("rollno"));
//                s.setName(rs.getString("name"));
//                s.setMarks(rs.getInt("marks"));
//                return s;
//            };


       return jdbc.query(sql,( rs,rowNum)->
       {   Student s=new Student();
           s.setRollNo(rs.getInt("rollno"));
           s.setName(rs.getString("name"));
           s.setMarks(rs.getInt("marks"));
           return s;
       });
      //this returned list of objects of type Student which will be stored in stud list

    }
}
