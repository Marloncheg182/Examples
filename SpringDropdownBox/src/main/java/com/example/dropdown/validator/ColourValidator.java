package com.example.dropdown.validator;

import com.example.dropdown.model.Colour;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public class ColourValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return Colour.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "colourName", "valid.colour");
    }
}
