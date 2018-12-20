package com.example.demo.controller;

import com.example.demo.controller.mappers.RegisterFormToUsersMapper;
import com.example.demo.domain.Users;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.model.UsersModel;
import com.example.demo.service.*;

import com.example.demo.validators.UsersRegisterValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import com.example.demo.utils.GlobalAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import static com.example.demo.utils.GlobalAttributes.ERROR_MESSAGE;

@Controller
@RequestMapping("/admin")
public class UsersRegistrationController {

    private static final String REGISTER_FORM = "registerForm";

    @Autowired
    UsersServiceImpl usersServiceImpl;

    @Autowired
    private UsersRegisterValidator registerValidator;

    @Autowired
    private RegisterFormToUsersMapper mapper;

    @InitBinder(REGISTER_FORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(registerValidator);
    }

    @GetMapping(value = "/register")
    public String register(Model model) {
        model.addAttribute(REGISTER_FORM,
                new UsersRegisterForm());
        return "adminCreateCustomer";
    }

    @PostMapping(value = "/register")
    public String register(Model model,
                           @Valid @ModelAttribute(REGISTER_FORM)
                                   UsersRegisterForm registerForm,
                           BindingResult bindingResult) {


        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute("errorMessage",  bindingResult.getAllErrors().get(0).getDefaultMessage());
            return redirect("admin/customers");
        }

        UsersModel userModel = mapper.mapToUserModel(registerForm);
        usersServiceImpl.create(userModel);
        return redirect("customers");
    }


    //@ExceptionHandler({BooksNotFoundException.class})
    public String handleError(HttpServletRequest request,
                              RedirectAttributes redirectAttrs,
                              RuntimeException e) {
        redirectAttrs.addFlashAttribute(ERROR_MESSAGE,
                "Couldn't fetch data");
        return "redirect:/";
    }

    private static String redirect(String uri) {
        return String.format("redirect:%s", uri);
    }

}
