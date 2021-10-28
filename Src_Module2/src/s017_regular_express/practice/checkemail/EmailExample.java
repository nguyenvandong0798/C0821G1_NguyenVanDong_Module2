package s017_regular_express.practice.checkemail;

public class EmailExample {
    private static Example example;
    private static final String [] validEmail = new String[] {"a@gmail.com, ab@yahoo.com, bc@hotmail.com"};
    private static final String [] invalidEmail = new String[] {"@gmail.com, ab@yahoo, %^&##@hotmail.com"};

    public static void main(String[] args) {
        example = new Example();
        for (String email: validEmail){
            boolean isvalid = example.check(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
//        for (String email : invalidEmail) {
//            boolean isvalid = example.check(email);
//            System.out.println("Email is " + email +" is valid: "+ isvalid);
//        }
    }
}
