package s03_array.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        int n;

        do {
            System.out.println(" enter length array");
            n = sc.nextInt();
        } while (n < 0);
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter value array:" + i + 1);
            array[i] = sc.nextInt();
        }
        min(array);
    }

    public static void min(int[] array) {
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println(" value min is: "+ min);
    }
}

