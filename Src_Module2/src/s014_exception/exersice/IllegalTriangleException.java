package s014_exception.exersice;

import s014_exception.practice.CalculationExample;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        System.out.println("Hãy nhập z: ");
        int z = scanner.nextInt();
        IllegalTriangleException cal = new IllegalTriangleException();
        cal.IllegalTriangleException(x, y, z);
    }

    private void IllegalTriangleException(int x, int y, int z) {
        try {
            if (x+y > z){
                
            }
        } catch (Exception e) {
            System.err.println("giá trị chưa đúng: ");
        }
        System.out.println("giá trị nhâp vào là  x" + x + "y" + y + "z" + z);
    }
}
