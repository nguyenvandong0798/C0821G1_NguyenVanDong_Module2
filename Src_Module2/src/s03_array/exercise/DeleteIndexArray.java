package s03_array.exercise;

import java.util.Scanner;

public class DeleteIndexArray {
    public static void main(String[] args) {
        int array [] = {10,4,6,7,8,6,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter in a number to delete:");
        int number = sc.nextInt();
        for (int i = 0; i < array.length; i++){
            if (number == array[i]){
                for (int j = i + 1; j < array.length; j++){
                    array[j - 1] = array[j];
                }
            }
            System.out.println(array[i]);
        }
    }
}
