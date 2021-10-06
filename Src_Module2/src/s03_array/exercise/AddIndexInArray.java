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
        for (int i = array.length - 1; i < index; i--) {
            if (array[index] == array[i]) ;
            array[i] = array[i - 1];
        }
        array[index] = number;
        for (int j = 0; j < array.length; j++){
                System.out.println(array[j]);
            }
        }
    }
