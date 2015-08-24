package RegularExp.ValidateTime12HS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class Time12HoursValidator {
    private Pattern pattern;
    private Matcher matcher;

    private static final String TIME12HOURS_PATTERN =
            "(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)";

    public Time12HoursValidator(){
        pattern = Pattern.compile(TIME12HOURS_PATTERN);
    }

    /**
     * Validate time in 12 hours format with regular expression
     * @param time time address for validation
     * @return true valid time fromat, false invalid time format
     */
    public boolean validate(final String time){
        matcher = pattern.matcher(time);
        return matcher.matches();
    }
}