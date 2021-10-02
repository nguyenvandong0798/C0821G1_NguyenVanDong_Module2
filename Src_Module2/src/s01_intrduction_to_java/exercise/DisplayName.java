package s01_intrduction_to_java.exercise;

import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("your name is: " + name);

    }
}
