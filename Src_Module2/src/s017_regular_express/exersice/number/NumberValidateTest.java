package s017_regular_express.exersice.number;

import s017_regular_express.exersice.name.NameValidate;

public class NumberValidateTest {
    private static NumberValidate numberValidate;
    private static String[] validNumber = new String[]{"(84)-(0978489648)"};
    private static String[] invalidNumber = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        numberValidate =new NumberValidate();
        for(String number : validNumber){
            boolean isvalid = numberValidate.valid(number);
            System.out.println("number is " + number +" is valid: "+ isvalid);

        }
        for (String number : invalidNumber) {
            boolean isvalid = numberValidate.valid(number);
            System.out.println("number is " + number +" is valid: "+ isvalid);
        }
    }
}
