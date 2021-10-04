package s02_loop_condition_into_java.practice;

import java.util.Scanner;

public class BankInterestRate {
    public static void main(String[] args) {
//        double money = 0;
//        double interestRate = 1.0;
//        int month = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter investment amount ");
         double money = sc.nextDouble();
        System.out.println("enter number of month");
         int month = sc.nextInt();
        System.out.println("enter annual interestRate in percentage ");
         double interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest = money * (interestRate/100)/12 * month;
            break;
        }
        System.out.println("total of interest: " + totalInterest);
    }
}
