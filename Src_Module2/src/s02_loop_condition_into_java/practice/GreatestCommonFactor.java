package s02_loop_condition_into_java.practice;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number a:");
        int a = sc.nextInt();
        System.out.println("enter a number b:");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b ==0){
            System.out.println("No greatest common factor");
        }
        while (a != b){
            if (a > b){
                a = a - b;
            }else{
                b = b -a;
            }
        }
        System.out.println("greatest common factor: " + a);
    }
}
