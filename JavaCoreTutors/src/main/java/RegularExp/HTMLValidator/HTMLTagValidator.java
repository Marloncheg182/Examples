package RegularExp.HTMLValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class HTMLTagValidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String HTML_TAG_PATTERN = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";

    public HTMLTagValidator(){
        pattern = Pattern.compile(HTML_TAG_PATTERN);
    }

    /**
     * Validate html tag with regular expression
     * @param tag html tag for validation
     * @return true valid html tag, false invalid html tag
     */
    public boolean validate(final String tag){

        matcher = pattern.matcher(tag);
        return matcher.matches();

    }
}
