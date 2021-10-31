package s016_IOStream2.exercise.controller;

import s016_IOStream2.exercise.sẻvice.ProductService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Hệ thông quản lý sản phẩm " + "\n");
            System.out.println("----------------------------------- ");
            System.out.println("1: Thêm sản phẩm");
            System.out.println("2: Hiển thị sản phẩm");
            System.out.println("3: Tìm kiếm sản phầm");
            System.out.println("0: Thoát khỏi hệ thống của chương trình" + "\n");
            System.out.print("nhập để chọn tính năng: ");

            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                System.out.println("--bạn đã thoát ra khỏi hệ thống--");
                break;
            }
            switch (choice) {
                case 1:
                    ProductService.addAll();
                    break;
                case 2:
                    ProductService.display();
                    break;
                case 3:
                    ProductService.Search();
            }
        }
    }
}