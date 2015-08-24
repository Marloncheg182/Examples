package RegularExp.HexColorCodeValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class HexValidator {

    private Pattern pattern;
    private Matcher matcher;

    public static final String HEX_PATTERN ="^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";

    public HexValidator() {
        pattern = Pattern.compile(HEX_PATTERN);
    }
    public boolean validate(final String hex){
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}
