package s01_intrduction_to_java.practice;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number a:");
        a = sc.nextDouble();
        System.out.println("enter a number b:");
        b = sc.nextDouble();
        System.out.println("enter a number c:");
        c = sc.nextDouble();
        if (a != 0){
            double x = (c-b)/a;
            System.out.println("x is:" + x);
        }else {
            if (b == c){
                System.out.println("the solution is all x:");
            }else{
                System.out.println("no solution!");
            }
        }
    }
}
