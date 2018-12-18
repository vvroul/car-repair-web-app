package com.example.demo.validators;

import com.example.demo.forms.LoginForm;
import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.forms.UsersSearchForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class LoginValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {

        return LoginForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {

        LoginForm loginForm = (LoginForm) target;

        //here perform your checks
        if (loginForm.getEmail() == null) {
            // add an error for the field called ‘email’
            errors.rejectValue("email", "email.empty");
        }

        ValidationUtils.rejectIfEmpty(errors, "password", "password.empty");
    }

}