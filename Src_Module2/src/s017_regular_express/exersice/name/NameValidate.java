package s017_regular_express.exersice.name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidate {
    private static final String NAME_REGEX = "^[CAP]+[0-9]{4}+[G-M]$";

    public NameValidate(){

    }


    public boolean valid(String regex) {
        Pattern pattern =Pattern.compile(NAME_REGEX);
        Matcher matcher =pattern.matcher(regex);
        return matcher.matches();
    }
}
