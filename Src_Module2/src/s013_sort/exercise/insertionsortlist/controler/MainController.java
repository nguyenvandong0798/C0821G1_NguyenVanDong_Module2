package s013_sort.exercise.insertionsortlist.controler;

import review.DSA.service.IsStudentService;
import review.DSA.service.StudentService;
import s013_sort.exercise.insertionsortlist.service.IsStudentServicee;
import s013_sort.exercise.insertionsortlist.service.StudentSv;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsStudentServicee isStudentService = new StudentSv();
        while (true) {
            System.out.println("1: Hiển thị thông tin của sinh viên");
            System.out.print("nhập để chọn tính năng: ");
            int Choice = Integer.parseInt(scanner.nextLine());
            switch (Choice) {
                case 1:
                    isStudentService.insertSort();
            }
        }
    }
}
