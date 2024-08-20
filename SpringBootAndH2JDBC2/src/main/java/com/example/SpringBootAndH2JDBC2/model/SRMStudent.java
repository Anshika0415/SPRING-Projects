package com.example.SpringBootAndH2JDBC2.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SRMStudent {
    private int RollNo;
    private String Name;
    private int Age;

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "SRMStudent{" +
                "RollNo=" + RollNo +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
