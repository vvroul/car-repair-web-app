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
@RequestMapping("/admin")
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

//    @GetMapping(value = "/searchCustomer") public String search(Model model) {
//        model.addAttribute(SEARCH_FORM,
//                new UsersSearchForm());
//        return "search";
//    }

    @PostMapping(value = "/searchCustomer")
    public String search(Model model,
                           @Valid @ModelAttribute(SEARCH_FORM)
                                   UsersSearchForm searchForm,
                           BindingResult bindingResult,
                         @RequestParam(value = "aFM", required = false, defaultValue = "") String aFM,
                         @RequestParam(value = "email", required = false, defaultValue = "") String email,
                         @RequestParam(value = "u_id", required = false, defaultValue = "") Long u_id) {


        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute("errorMessage", "an error occurred");
            return "search";
        }

//
        Users theUsers =  usersServiceImpl.getUsersByAFMAndEmail(searchForm.getaFM(), searchForm.getEmail());
        aFM = theUsers.getaFM();UsersModel userModel = mapper.mapToUserModel(searchForm);
        email = theUsers.getEmail();
        u_id = theUsers.getU_id();
        model.addAttribute("aFM", aFM);
        model.addAttribute("email", email);
        model.addAttribute("u_id", u_id);
        return "adminSearchCustomerResult";
    }
}
