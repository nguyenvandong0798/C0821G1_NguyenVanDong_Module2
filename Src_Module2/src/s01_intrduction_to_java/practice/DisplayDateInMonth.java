package s01_intrduction_to_java.practice;

import java.util.Scanner;

public class DisplayDateInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a month:");
        int month = sc.nextInt();
        String  Dayinmonth;
        switch (month){
            case 2:
                Dayinmonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 7:
            case 8:
            case 10:
            case 12:
            case 5:
                Dayinmonth = "31 Day";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                Dayinmonth = "30 Day";
                break;
            default:
                Dayinmonth = "";
        }
        if (Dayinmonth != "")
            System.out.printf("month '%d' has %s", month,Dayinmonth );
        else
            System.out.print("invalid input");

    }
}
