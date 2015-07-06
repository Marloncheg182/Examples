package mvc.validator;
import mvc.entity.Phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Dell on 6/14/2015.
 */
public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {
    @Override
    public void initialize(Phone phone) {

    }

    @Override
    public boolean isValid(String phoneField, ConstraintValidatorContext ctx) {
        if (phoneField == null) {
            return false;
        }
        return phoneField.matches("[0?9()?\\.]*");
    }
}