import java.util.Scanner;

public class bai_tap_chuyen_doi_tien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long vn = 23000;
        long usd, result;
        System.out.println("enter a USD");
        usd = sc.nextLong();
        result = usd * vn;
        System.out.println("result is:" + result);
    }
}
