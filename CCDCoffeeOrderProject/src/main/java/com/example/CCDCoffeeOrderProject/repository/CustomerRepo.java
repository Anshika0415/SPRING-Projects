package com.example.CCDCoffeeOrderProject.repository;

import com.example.CCDCoffeeOrderProject.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepo {
    JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
@Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void addOrderRepo(CustomerModel order) {
        String sql="insert into customers(cid,cname,coffeetype,price) values (?,?,?,?)";
        int rows=jdbc.update(sql,order.getCid(),order.getCname(),order.getCoffeetype(),order.getPrice());
        System.out.println(rows +" effected");

    }
}

