package s02_loop_condition_into_java.exercise;

import java.util.Scanner;

public class DisplayNumbersPrimeLessThan100 {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 1; i < number; i++){
            int count = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count ++;
                }
            }
            if (count == 2){
                System.out.println(i);
            }
        }
    }
}
