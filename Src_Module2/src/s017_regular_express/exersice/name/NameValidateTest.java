package s017_regular_express.exersice.name;



public class NameValidateTest {
    private static NameValidate nameValidate;
    private static String[] validName = new String[]{"C0318G"};
    private static String[] invalidName = new String[]{"M0318G, P0323A"};

    public static void main(String[] args) {
        nameValidate =new NameValidate();
        for(String name : validName){
            boolean isvalid = nameValidate.valid(name);
            System.out.println("name is " + name +" is valid: "+ isvalid);

        }
        for (String name : invalidName) {
            boolean isvalid = nameValidate.valid(name);
            System.out.println("name is " + name +" is valid: "+ isvalid);
        }
    }
}
