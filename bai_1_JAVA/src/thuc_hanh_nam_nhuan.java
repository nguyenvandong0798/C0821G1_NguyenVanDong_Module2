import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class thuc_hanh_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("enter a year:");
        year = scanner.nextInt();
        if (year %4 == 0){
            if (year %100 == 0){
                if (year %400 == 0){
                    System.out.println("is a leep year");
                }else {
                    System.out.println("is Not leep year");
                }
            }else{
                System.out.println("is a leep year");
            }
        }else {
            System.out.println("is NOT a leep year");
        }

    }
}
