package s014_exception.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer [] createRandom(){
        Random random = new Random();
        Integer[]arr = new Integer[100];
        System.out.println("danh sách các phần tử của mảng: ");
        for (int i = 0; i<100;i++){
            arr[i] = random.nextInt();
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[]arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui lòng nhập chỉ số của phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("giá trị của phần tử có chỉ số 5" + x + +arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("chỉ số vượt quá giới hạn của mảng");
        }
    }
}
