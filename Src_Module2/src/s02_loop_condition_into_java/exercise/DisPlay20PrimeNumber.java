package s02_loop_condition_into_java.exercise;

import java.util.Scanner;

public class DisPlay20PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number:");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            if (isPrimeNumber(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}