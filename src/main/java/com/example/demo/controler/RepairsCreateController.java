package com.example.demo.controler;

import com.example.demo.controler.mappers.CreateFormToRepairsMapper;
import com.example.demo.controler.mappers.SearchFormToRepairsMapper;
import com.example.demo.form.RepairsCreateForm;
import com.example.demo.model.RepairsModel;
import com.example.demo.service.RepairsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RepairsCreateController {
    private static final String CREATION_FORM = "creationForm";

    @Autowired
    RepairsServiceImpl repairsServiceImpl;

    @Autowired
    private CreateFormToRepairsMapper mapper;

    @GetMapping(value = "/admin/repairs")
    public String createRepairs (Model model){
        model.addAttribute(CREATION_FORM, new RepairsCreateForm());
        return "a_repairs";
    }

    @PostMapping(value = "/admin/repairs")
    public String createRepairs (Model model, RepairsCreateForm form){
        RepairsModel repairsModel = mapper.mapToRepairsModel(form);
        repairsServiceImpl.create(repairsModel);
        return "a_repairs";
    }



}
