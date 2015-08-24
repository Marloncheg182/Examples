package RegularExp.PasswordValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class PasswordValidator {
    private Pattern pattern;
    private Matcher matcher;

    private static final String PASSWORD_PATTERN =
            "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

    public PasswordValidator() {
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }
    public boolean validate(final String password){
        matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
