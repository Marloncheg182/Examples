package mvc.entity;
import mvc.validator.PhoneConstraintValidator;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by Dell on 6/14/2015.
 */
@Documented
@Constraint(validatedBy = PhoneConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
    String message()default "{Phone}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[]payload() default {};
}
