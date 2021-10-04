package s02_loop_condition_into_java.practice;

import java.util.Scanner;

public class CheckNumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " is Not number prime");
        }else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0)
                    check = false;
                break;
            }
            if (check) {
                System.out.println(number + " is number prime");
            } else {
                System.out.println(number + " is NOt number prime");
            }
        }
    }
}
