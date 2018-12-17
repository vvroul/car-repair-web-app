package com.example.demo.controller;
import com.example.demo.domain.Repairs;
import com.example.demo.domain.Users;
import com.example.demo.model.RepairsModel;
import com.example.demo.model.UsersModel;
import com.example.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Controller
@RequestMapping(path = "/admin")
public class UsersAdminHomeController {

    @Autowired
    RepairsServiceImpl repairsServiceImpl;


    @GetMapping(value = "/")
    public String adminHome(Model model) {
        List<RepairsModel> topRepairs = repairsServiceImpl.getFirst10tByDateTime();
        model.addAttribute("topRepairs", topRepairs);
        return "adminHome";
    }

    @PostMapping(value = "/")
    public String updatedCustomers(Model model) {
        List<RepairsModel> topRepairs = repairsServiceImpl.getFirst10tByDateTime();
        model.addAttribute("topRepairs", topRepairs);
        return "adminHome";
    }

}
