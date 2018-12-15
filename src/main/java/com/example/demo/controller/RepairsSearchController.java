package com.example.demo.controller;

import com.example.demo.controller.mappers.SearchFormToHybridMapper;
import com.example.demo.controller.mappers.SearchFormToRepairsMapper;
import com.example.demo.controller.mappers.SearchFormToUsersMapper;
import com.example.demo.forms.RepairsSearchForm;
import com.example.demo.forms.UsersSearchForm;
import com.example.demo.model.HybridModel;
import com.example.demo.model.RepairsModel;
import com.example.demo.model.UsersModel;
import com.example.demo.service.RepairsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;

@RequestMapping(value = "/admin")
@Controller
public class RepairsSearchController {
    private static final String REPAIRS_SEARCH_FORM = "repairSearchForm";

    @Autowired
    RepairsServiceImpl repairsServiceImpl;

    @Autowired
    private SearchFormToHybridMapper repairsMapper;

    @PostMapping(value = "/repairsSearch")
    public String searchRepairs (Model model, @Valid @ModelAttribute(REPAIRS_SEARCH_FORM) RepairsSearchForm repairsForm,
                                 @RequestParam(value = "aFM", required = false, defaultValue = "") Long aFM,
                                 @RequestParam(value = "vPlate", required = false, defaultValue = "") String vPlate,
                                 @RequestParam(value = "dateTime", required = false, defaultValue = "")
                                     @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateTime ) {

        HybridModel hybridModel = repairsMapper.mapToHybridModel(repairsForm);
        aFM = hybridModel.getaFM();
        vPlate = hybridModel.getVPlate();
        dateTime = hybridModel.getDateTime();
        model.addAttribute("aFM", aFM);
        model.addAttribute("vPlate", vPlate);
        model.addAttribute("dateTime", dateTime);
        repairsServiceImpl.getRepairsByDateAndAFMAndPlate(hybridModel);
        return "displayRepairsResults";
    }



}
