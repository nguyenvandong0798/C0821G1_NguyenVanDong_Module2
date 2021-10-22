package other.manageStaff.controller;

import other.manageStaff.service.ofStaff;

import java.util.Scanner;

public class ManageStaff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("HỆ THỐNG QUẢN LÝ NHÂN VIÊN + \n");
            System.out.println("----------------------");
            System.out.println("1: thêm Staff vào danh sách");
            System.out.println("2: Chỉnh sửa tên của Staff");
            System.out.println("3: Hiển thị danh sách Staff");
            System.out.println("4: Xoá bỏ Staff ra khỏi danh sách");
            System.out.println("5: Nhập mã để hiển thị Staff");
            System.out.println("6: Nhập số giời làm việc của Staff");
            System.out.println("7: Sắp xếp Staff theo mã" + "\n");
            System.out.println("0: Exit " + "\n");
            System.out.print("Nhập để chọn tính năng ");

            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0){
                System.out.println("--bạn đã thoát khỏi hệ thống--");
                break;
            }
            switch (choice){
                case 1:
                    ofStaff.addStaff();
                    break;
                case 0:
                    break;
            }
        }
    }
}
