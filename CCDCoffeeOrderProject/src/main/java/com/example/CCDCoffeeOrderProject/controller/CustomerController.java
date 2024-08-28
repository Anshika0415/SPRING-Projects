package com.example.CCDCoffeeOrderProject.controller;

import com.example.CCDCoffeeOrderProject.model.CustomerModel;
import com.example.CCDCoffeeOrderProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService cserv;
    @GetMapping({"/","/home"})
     public String home()
     {
         return "home.jsp";
     }
    @GetMapping("takeOrder")
    public String addJob()
    { //this is name of your jsp page
        return "takeOrder.jsp";
    }
    @PostMapping("handleForm")
    public String handleForm(CustomerModel Order,Model model)
    {   model.addAttribute("Order", Order);
        cserv.addOrder(Order);
        return "orderPlaced.jsp";
    }

}
