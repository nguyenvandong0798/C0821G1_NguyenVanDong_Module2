package s011_map.exercise.control;

import s011_map.exercise.ProductService;

import s011_map.exercise.service.IsProductService;

import java.util.Scanner;

public class ManageProduct{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsProductService isProductService = new ProductService();
        while (true){

            System.out.println("Hệ thông quản lý sản phẩm " + "\n");
            System.out.println("----------------------------------- ");
            System.out.println("1: Thêm sản phẩm");
            System.out.println("2: Sửa thông tin của sản phẩm");
            System.out.println("3: Xoá sản phẩm theo code");
            System.out.println("4: Hiển thị danh sách sản phẩm");
            System.out.println("5: Tìm kiếm sản phẩm theo tên");
            System.out.println("6: Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7: Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("0: Thoát khỏi hệ thống của chương trình" +"\n");
            System.out.print("nhập để chọn tính năng: ");

            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0){
                System.out.println("--bạn đã thoát ra khỏi hệ thống--");
                break;
            }
            switch (choice){
                case 1:
                    isProductService.addAll();
                    break;
                case 2:
                    isProductService.edit();
                    break;
                case 3:
                    isProductService.reMove();
                    break;
                case 4:
                    isProductService.display();
                    break;
                case 5:
                    isProductService.search();
                    break;
                case 6:
                    isProductService.rangeRaise();
                    break;
                case 7:
                    isProductService.rangeDown();
                    break;
            }
        }
    }
}

