package com.example.demo.validators;

import com.example.demo.forms.UsersRegisterForm;
import com.example.demo.forms.UsersSearchForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UsersSearchValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {

        return UsersSearchForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {

        UsersSearchForm searchForm = (UsersSearchForm) target;

        //here perform your checks
        if (searchForm.getEmail() == null) {
            // add an error for the field called ‘email’
            errors.rejectValue("email", "email.empty");
        }

        ValidationUtils.rejectIfEmpty(errors, "aFM", "aFM.empty");
    }

}