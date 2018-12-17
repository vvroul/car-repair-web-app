package com.example.demo.controller;

import com.example.demo.controller.mappers.RegisterFormToUsersMapper;
import com.example.demo.controller.mappers.SearchFormToUsersMapper;
import com.example.demo.domain.Users;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.forms.UsersSearchForm;
import com.example.demo.model.UsersModel;
import com.example.demo.service.*;

import com.example.demo.validators.UsersRegisterValidator;
import com.example.demo.validators.UsersSearchValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import com.example.demo.utils.GlobalAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class UsersSearchController {

    private static final String SEARCH_FORM = "searchForm";

    @Autowired
    UsersServiceImpl usersServiceImpl;

    @Autowired
    private UsersSearchValidator searchValidator;

    @Autowired
    private SearchFormToUsersMapper mapper;

    @InitBinder(SEARCH_FORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(searchValidator);
    }

//    @GetMapping(value = "/search") public String search(Model model) {
//        model.addAttribute(SEARCH_FORM,
//                new UsersSearchForm());
//        return "search";
//    }

    @PostMapping(value = "/search")
    public String search(Model model,
                           @Valid @ModelAttribute(SEARCH_FORM)
                                   UsersSearchForm searchForm,
                           BindingResult bindingResult,
                         @RequestParam(value = "aFM", required = false, defaultValue = "") String aFM,
                         @RequestParam(value = "email", required = false, defaultValue = "") String email ) {


        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute("errorMessage", "an error occurred");
            return "search";
        }

        UsersModel userModel = mapper.mapToUserModel(searchForm);
        Users theUsers =  usersServiceImpl.getUsersByAFMAndEmail(userModel.getaFM(), userModel.getEmail());
        aFM = theUsers.getaFM();
        //System.out.println("afm : " + aFM);
        email = theUsers.getEmail();
        model.addAttribute("aFM", aFM);
        //System.out.println("email : " + email);
        model.addAttribute("email", email);
        return "displayResults";
    }
}
