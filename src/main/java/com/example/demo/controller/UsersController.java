package com.example.demo.controller;

import com.example.demo.domain.Users;
import com.example.demo.model.RepairsModel;
import com.example.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping(path = "/users")
public class UsersController {

    @Autowired
    RepairsServiceImpl repairsServiceImpl;

    @GetMapping("/{id}")
    public String home(@PathVariable String id, ModelMap model) {
        List<RepairsModel> repairs = repairsServiceImpl.getRepairsByOwner(Long.parseLong(id));
        model.addAttribute("theRepairs", repairs);
        return "customerMain";
    }

}
