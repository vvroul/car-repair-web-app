package com.example.demo.controller;

import com.example.demo.controller.mappers.CreateFormToRepairsMapper;
import com.example.demo.forms.RepairsCreateForm;
import com.example.demo.model.RepairsModel;
import com.example.demo.service.RepairsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping(value = "/admin")

@Controller
public class RepairsCreateController {
    private static final String CREATION_FORM = "creationForm";

    @Autowired
    RepairsServiceImpl repairsServiceImpl;

    @Autowired
    private CreateFormToRepairsMapper mapper;

    @GetMapping(value = "/create_repairs")
    public String createRepairs (Model model){
        model.addAttribute(CREATION_FORM, new RepairsCreateForm());
        return "create_repairs";
    }

    @PostMapping(value = "/create_repairs")
    public String createRepairs (Model model, @Valid @ModelAttribute(CREATION_FORM) RepairsCreateForm form){
        RepairsModel repairsModel = mapper.mapToRepairsModel(form);
        repairsServiceImpl.create(repairsModel);
        return "create_repairs";
    }



}
