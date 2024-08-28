package com.example.CCDCoffeeOrderProject.service;

import com.example.CCDCoffeeOrderProject.model.CustomerModel;
import com.example.CCDCoffeeOrderProject.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo repo;
    public void addOrder(CustomerModel corder) {
        repo.addOrderRepo(corder);
    }
}
