package s017_regular_express.practice.checkemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_EXAMPLE = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";


    public Example() {
        pattern = Pattern.compile(EMAIL_EXAMPLE);
    }

    public static boolean check(String regex){
         matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
