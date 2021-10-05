package s03_array.exercise;

import java.util.Scanner;

public class FindMaxValueIn2dimensionalArrays {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 8, 6}};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max ){
                    max = array[i][j];
                }
            }
        }
        System.out.println(" max is " + max);
    }
}
