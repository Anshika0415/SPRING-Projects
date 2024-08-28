package com.example.CCDCoffeeOrderProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CustomerModel {

    private int cid;
    private String cname;
    private String coffeetype;
    private int price;
}
