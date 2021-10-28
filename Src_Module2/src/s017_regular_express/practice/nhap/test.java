package s017_regular_express.practice.nhap;

import java.util.regex.Pattern;

public class test {
    public static String REDEX_NAME = "^[a-zA-Z]{5-10}";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REDEX_NAME);

    }
}
