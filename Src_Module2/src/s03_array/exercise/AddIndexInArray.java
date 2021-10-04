package s03_array.exercise;

import java.util.Scanner;

public class AddIndexInArray {
    public static void main(String[] args) {
        int array [] = {10,4,6,7,8,6,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter in a number to add:");
        int number = sc.nextInt();
        System.out.println("enter index:");
        int index = sc.nextInt();
        for (int i = 0; i < array.length; i++){
            if (array[index] == array[i]);
            array[i] = i + 1;
            for (int j = 0; j < array.length; j++){
                number = array[index];
            }
            System.out.println(array[i]);
        }
    }
}
