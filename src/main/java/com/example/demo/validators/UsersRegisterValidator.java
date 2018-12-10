package com.example.demo.validators;

import com.example.demo.forms.UsersRegisterForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UsersRegisterValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {

        return UsersRegisterForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {

        UsersRegisterForm registrationForm = (UsersRegisterForm) target;

        //here perform your checks
        if (registrationForm.getEmail() == null) {
            // add an error for the field called ‘email’
            errors.rejectValue("email", "email is empty");
        }

        ValidationUtils.rejectIfEmpty(errors, "username", "username.empty");
    }

}