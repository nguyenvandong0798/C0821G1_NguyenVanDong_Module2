package s017_regular_express.practice.checkAccount;



public class AccountExampleTest {
    private static AccountExample accountExample;
    private static String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh"};
    private static String[] invalidAccount = new String[]{".@, 12345, 1234_, abcde "};

    public static void main(String[] args) {
        accountExample =new AccountExample();
        for(String ac : validAccount){
            boolean isvalid = accountExample.valid(ac);
            System.out.println("Account is " + ac +" is valid: "+ isvalid);

        }
        for (String ac : invalidAccount) {
            boolean isvalid = accountExample.valid(ac);
            System.out.println("Account is " + ac +" is valid: "+ isvalid);
        }
    }
}
