package com.example.demo.controller;

import com.example.demo.model.UsersModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class eaController {

    @GetMapping(value = "/ea")
    public String customers() {
        return "team8EA";
    }
}
