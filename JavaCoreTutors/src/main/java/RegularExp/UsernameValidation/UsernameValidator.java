package RegularExp.UsernameValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class UsernameValidator {
    private Pattern pattern;
    private Matcher matcher;

    private static final String USERNAME_PATTERN = "^[z-z0-9_-]{3.15}$";

    public UsernameValidator() {
        pattern = Pattern.compile(USERNAME_PATTERN);
    }

    /**
     * Validate username with regular expression
     * @param username fir validation
     * @return true valid username, false invalid username
     */
    public boolean validate(final String username){
        matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
