package s02_loop_condition_into_java.practice;

import java.util.Scanner;

public class Nhap {
    public static void main(String[] args) {
        int [] num = {1,8,2,4,5};
        float avg = average(num);
        System.out.println("gia tri trung binh: " + avg);
    }


    public static float average(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum +=arr[i];
        }
        return (float) sum / arr.length;
    }
}

