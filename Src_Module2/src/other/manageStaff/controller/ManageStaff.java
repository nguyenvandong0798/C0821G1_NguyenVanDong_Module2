package other.manageStaff.controller;

import other.manageStaff.service.IsOfStaff;
import other.manageStaff.service.ofStaff;

import java.text.BreakIterator;
import java.util.Scanner;

public class ManageStaff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsOfStaff isOfStaff = new ofStaff();
        while(true){
            System.out.println("HỆ THỐNG QUẢN LÝ NHÂN VIÊN" + "\n");
            System.out.println("----------------------");
            System.out.println("1: thêm Staff vào danh sách");
            System.out.println("2: Hiển thị Staff ");
            System.out.println("3: tim kiem Staff ");
            System.out.println("4: xoa Staff " + "\n");
            System.out.println("0: Exit " + "\n");
            System.out.print("Nhập để chọn tính năng ");

            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0){
                System.out.println("--bạn đã thoát khỏi hệ thống--");
                break;
            }
            switch (choice){
                case 1:
                    isOfStaff.addStaff();
                    break;
                case 2:
                    isOfStaff.showAll();
                    break;
                case 3:
                    isOfStaff.search();
                    break;
                case 4:
                    isOfStaff.remove();
                    break;
                case 0:
                    break;
            }
        }
    }
}
