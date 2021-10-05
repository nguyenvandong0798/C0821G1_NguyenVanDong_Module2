package s03_array.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int array1[] = {1, 2, 3,};
        int array2[] = {4, 5, 6,};
        int array3[] = sum(array1, array2);
        for (int i = 0; i < array3.length; i++){
            System.out.println(array3[i]);
        }
    }

    public static int[] sum(int array1[], int array2[]) {
        int array3[] = new int[array1.length + array2.length];
        int i;
        for (i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[i++] = array2[j];
        }
        return array3;
    }
}
