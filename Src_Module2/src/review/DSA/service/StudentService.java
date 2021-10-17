package review.DSA.service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IsStudentService {
    Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(5, "Nguyen Van Dong", "Quang Nam", 6));
        studentList.add(new Student(6, "Dang Huu Du", "Quang Nam", 8));
        studentList.add(new Student(7, "Nguyen Anh Tam", "Quang Nam", 7));
    }

    @Override
    public void showAll() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void addNewStudent() {
        System.out.println("Nhập vị trí cần thêm mới");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập id cần thêm mới");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên cần thêm mới");
        String name = (scanner.nextLine());
        System.out.println("Nhập địa chỉ cần thêm mới");
        String address = (scanner.nextLine());
        System.out.println("Nhập điểm cần thêm mới");
        int point = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, address, point);
        studentList.add(index, student);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    @Override
    public void reMove() {
        System.out.println("Nhập vào vị trí cần xoá");
        int index = Integer.parseInt(scanner.nextLine());
        studentList.remove(index);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }

    @Override
    public void edit() {
        System.out.println("nhập vào index cần chỉnh sửa");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (i == index) {
                System.out.println("Nhập id cần edit");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên cần edit");
                String name = (scanner.nextLine());
                System.out.println("Nhập địa chỉ cần edit");
                String address = (scanner.nextLine());
                System.out.println("Nhập điểm cần edit");
                int point = Integer.parseInt(scanner.nextLine());
                studentList.get(i).setId(id);
                studentList.get(i).setName(name);
                studentList.get(i).setAddress(address);
                studentList.get(i).setPoint(point);
                for (int j = 0; j < studentList.size(); j++) {
                    System.out.println(studentList.get(j));
                }
            }
        }
    }

    @Override
    public void test() {
        boolean check = false;
        System.out.println("nhập vào id cần kiểm tra");
        int enterId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == enterId) {
                System.out.println("đã có trong danh sánh");
                System.out.println(studentList.get(i));
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("mã sinh viên là : " + enterId + " không có trong danh sách");
        }
    }

    @Override
    public void enterDisplay() {
        boolean check = false;
        System.out.println("nhập vào id cần hiển thị");
        int enterId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == enterId) {
                System.out.println(studentList.get(i));
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("không tồn tại trong danh sách");
        }
    }

    @Override
    public void ranger() {
        Collections.sort(studentList);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }
}
