package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(path="/")
    public String home(){
//        return "home";
//        return "customerMain";
//        return "adminMain";
//        return "adminCreateCustomer";
//        return "adminCreateRepair";
//        return "adminSearchCustomer";
        return "adminSearchRepair";
//        return "adminEditCustomer";
//        return "adminEditRepair";
//        return "adminSearchCustomerResult";
//        return "adminSearchRepairResult";
    }

}
