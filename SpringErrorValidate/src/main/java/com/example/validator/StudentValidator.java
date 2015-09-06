package com.example.validator;

import com.example.model.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public class StudentValidator implements Validator {
    @Override
    public boolean supports(Class<?> paramClass) {
        return Student.class.equals(paramClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "valid.name");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "valid.lastName");
    }
}
