package com.example.demo.controller;

import com.example.demo.controller.mappers.LoginFormToUsersMapper;
import com.example.demo.controller.mappers.UsersToUsersMapper;
import com.example.demo.domain.Users;
import com.example.demo.enumeration.UserTypeEnum;
import com.example.demo.forms.LoginForm;
import com.example.demo.service.UsersServiceImpl;
import com.example.demo.validators.LoginValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import static com.example.demo.utils.GlobalAttributes.ERROR_MESSAGE;

@Controller
public class LoginController {

    private static final String LOGIN_FORM = "loginForm";

    @Autowired
    UsersServiceImpl usersServiceImpl;

    @Autowired
    LoginValidator loginValidator;

    @Autowired
    private LoginFormToUsersMapper mapper;

    @Autowired
    private UsersToUsersMapper usersMapper;

    @InitBinder(LOGIN_FORM)
    protected void initBinder(final WebDataBinder binder) {
        binder.addValidators(loginValidator);
    }

    @GetMapping(path = "/")
    public String home(Model model) {
        model.addAttribute(LOGIN_FORM, new LoginForm());
        return "home";
    }

    @PostMapping(value = "/")
    public String search(Model model,
                         @Valid @ModelAttribute(LOGIN_FORM)
                                 LoginForm loginForm,
                         BindingResult bindingResult,
                         @RequestParam(value = "password", required = false, defaultValue = "") String password,
                         @RequestParam(value = "email", required = false, defaultValue = "") String email) {


        if (bindingResult.hasErrors()) {
            //have some error handling here, perhaps add extra error messages to the model
            model.addAttribute("errorMessage", bindingResult.getAllErrors().get(0).getDefaultMessage());
            return redirect("/ea");
        }

        Users user = usersServiceImpl.getUsersByEmailAndPassword(loginForm.getEmail(), loginForm.getPassword());
        if (user.getuType() == UserTypeEnum.ADMIN) {
            return redirect("admin");
        }
        return redirect("users/" + user.getU_id().toString());
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