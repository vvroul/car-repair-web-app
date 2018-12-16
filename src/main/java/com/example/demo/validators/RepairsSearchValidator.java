package com.example.demo.validators;

import com.example.demo.forms.RepairsSearchForm;
import com.example.demo.forms.UsersSearchForm;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class RepairsSearchValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {

        return RepairsSearchForm.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object target, Errors errors) {

        RepairsSearchForm searchForm = (RepairsSearchForm) target;

        //here perform your checks
        if (searchForm.getaFM() == null) {
            // add an error for the field called ‘email’
            errors.rejectValue("aFM", "aFM.empty");
        }

        ValidationUtils.rejectIfEmpty(errors, "vPlate", "vPlate.empty");
    }
}
