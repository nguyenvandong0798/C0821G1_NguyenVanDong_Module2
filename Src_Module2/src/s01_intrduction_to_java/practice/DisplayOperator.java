package s01_intrduction_to_java.practice;

import java.util.Scanner;

public class DisplayOperator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        width = sc.nextFloat();
        System.out.println("enter a number");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println("area is :" + area);

    }
}
