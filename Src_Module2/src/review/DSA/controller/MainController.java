package review.DSA.controller;

import review.DSA.service.IsStudentService;
import review.DSA.service.Student;
import review.DSA.service.StudentService;

import java.util.Collections;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsStudentService isStudentService = new StudentService();
        while (true) {
            System.out.println("Hệ thông quản lý sinh viên của trường ABC " + "\n");
            System.out.println("----------------------------------- ");
            System.out.println("1: Hiển thị thông tin của sinh viên");
            System.out.println("2: Thêm sinh viên vào danh sách");
            System.out.println("3: Xoá sinh viên ");
            System.out.println("4: SỬa thông tin của sinh viên");
            System.out.println("5: kiểm tra sinh đó đã có hay chưa");
            System.out.println("6: Nhập mã sinh viên và hiển thị thông tin của sinh viên");
            System.out.println("7: Săp xếp sinh viên theo điểm số" + "\n");
            System.out.print("nhập để chọn tính năng: ");
            int Choice = Integer.parseInt(scanner.nextLine());
            switch (Choice) {
                case 1:
                    isStudentService.showAll();
                    break;
                case 2:
                    isStudentService.addNewStudent();
                    break;
                case 3:
                    isStudentService.reMove();
                    break;
                case 4:
                    isStudentService.edit();
                    break;
                case 5:
                    isStudentService.test();
                    break;
                case 6:
                    isStudentService.enterDisplay();
                    break;
                case 7:
                    isStudentService.ranger();
                    break;
            }
        }
    }
}
