package review.bank;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Scanner;

public class Account {
    private long number;
    private String name;
    private double money;
    private final double interestRate = 0.035d;

    public Account(){

    }

    public Account (long number,String name){
        this.number = number;
        this.name = name;
    }


    public Account(long number, String name, double money){
        this.number = number;
        this.name = name;
        this.money = money;

    }
//phương thức nạp tiền
    public double inputMoney (){
        Scanner scanner = new Scanner(System.in);
        double input = 0;
        while (input < 50000){
            System.out.print("\n"+ "nạp thêm tiền vào tài khoản từ 50000 trở lên: "+ "\n");
            input = scanner.nextDouble();
        }
        return this.money = this.money + input;
    }

//    phương thức rút tiền
    public double outputMoney (){
        final double tax = 2000.0d;
        Scanner scanner = new Scanner(System.in);
        double output = 0;
        while (output < 50000) {
            System.out.println("nhập lại số tiền cần rút từ 50000 trở lên" + "\n");
            output = scanner.nextDouble();
        }
        return this.money = this.money - (output + tax);
    }
//    chuyển tiền đến account2
    public double transfers1 (){
        Scanner scanner = new Scanner(System.in);
        double tf = 0;
        while (tf < 50000 && this.money >= 50000){
            System.out.print("nhập vào số tiền cần chuyển từ 50000 trở lên: "+ "\n");
            tf = scanner.nextDouble();
        }
        return this.money = this.money - tf;
    }

//    account 2 sẽ nhận được tiền chuyên đến từ account 1
    public double getAcount1(){
        return this.money = this.money ;
    }
//     đến hạn
    public double rest (){
        return this.money = this. money + (this.money * interestRate);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account Information:"
                + "\n" + "number: " + number
                + "\n" + "name: " + name
                + "\n" + "money: " + money;
    }


    public static void main(String[] args) {
//        Thông tin account 1
        Account account1 = new Account(1254653148, "NGUYEN VAN DONG",50000);
        System.out.println(account1);

//        nạp tiền vào tài khoản account 1
        account1.inputMoney();
        System.out.println(account1);

//        rút tiền trong tài khoản account 1
        account1.outputMoney();
        System.out.println(account1);

//        đến thời điểm đấu hạng
        System.out.println("\n" + "đến kỳ đấu hạn" + "\n" );
        account1.rest();
        System.out.println(account1 + " \n");


//        nhập vào số tiền cần chuyển đến account 2
        account1.transfers1();
        System.out.println(account1 + "\n");

        //        Thông tin của account 2
        Account account2 = new Account(1251223148, "NGUYEN VAN TEO",50000);
        System.out.println(account2+ "\n");

//account2 Nhận được thêm số tiền
        account2.getAcount1();
        System.out.println(account2);
    }
}
