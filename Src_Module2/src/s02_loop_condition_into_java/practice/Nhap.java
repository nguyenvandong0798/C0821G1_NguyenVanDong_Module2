package s02_loop_condition_into_java.practice;

import java.util.Scanner;

public class Nhap {
    public static void main(String[] args) {
//        int [] num = {1,8,2,4,5};
//        float avg = average(num);
//        System.out.println("gia tri trung binh: " + avg);
//    }
//
//
//    public static float average(int[] arr){
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++){
//            sum +=arr[i];
//        }
//        return (float) sum / arr.length;



//        int[] a = {1,9,3,2};
//        for(int i=0;i<a.length-1;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i] > a[j]){
//                    int x = a[i];
//                    a[i] = a[j];
//                    a[j] = x;
//                }
//            }
//        }


        int[] x = {5, 6, 7, 8};

        for(int i = 0; i < x.length; i++){

            if(i % 2 == 0){

                continue;

            }

            System.out.print(i);

        }
    }
}

