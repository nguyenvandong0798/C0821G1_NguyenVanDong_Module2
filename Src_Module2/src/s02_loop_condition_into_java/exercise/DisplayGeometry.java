package s02_loop_condition_into_java.exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {

//        display a rectangle
        int a = 3;
        int b = 7;
      for (int i = 0; i < a; i++){
          for (int j = 0; j < b; j++){
              System.out.print(" * ");
          }
          System.out.println("\n");
      }


//        display a square botton-left
        int c = 5;
        for (int i = 1; i <= c; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }


//        display a square top-left
        int d = 5;
        for (int i = 0; i <= d; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
}
