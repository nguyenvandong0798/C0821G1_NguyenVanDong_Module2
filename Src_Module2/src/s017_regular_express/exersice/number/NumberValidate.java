package s017_regular_express.exersice.number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidate {
    private static final String NUMBER_REGEX = "^\\(84\\)-\\(\\d{10}\\)$";

    public NumberValidate(){

    }

    public boolean valid(String regex) {
        Pattern pattern =Pattern.compile(NUMBER_REGEX);
        Matcher matcher =pattern.matcher(regex);
        return matcher.matches();
    }
}
