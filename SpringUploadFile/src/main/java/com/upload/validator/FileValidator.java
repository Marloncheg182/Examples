package com.upload.validator;

import com.upload.model.File;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public class FileValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return File.class.equals(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
     File file = (File)obj;
        if (file.getFile().getSize()==0){
            errors.rejectValue("file", "valid.file");
        }
    }
}
