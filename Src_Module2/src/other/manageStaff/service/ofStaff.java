package other.manageStaff.service;

import other.manageStaff.model.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ofStaff {
    private static List<Staff> staffList = new ArrayList<>();
    public static void addStaff(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập vị trí cần thêm ");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.print(" nhập tên Staff cần thêm ");
        String name = (scanner.nextLine());
        System.out.print("nhập ngày tháng năm sinh Staff ");
        int date = Integer.parseInt(scanner.nextLine());
        System.out.print(" nhập code của staff ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print(" nhập địa chỉ của Staff ");
        String address = (scanner.nextLine());
        System.out.println(" nhập giời công Staff");
        int workData = Integer.parseInt(scanner.nextLine());
        long salary = workData * 30000;
        Staff staff = new Staff(name, date, code, address, salary);
        staffList.add(index,staff);
        for (int i = 0; i< staffList.size(); i++){
            System.out.println(staffList.get(i));
        }
    }
}
