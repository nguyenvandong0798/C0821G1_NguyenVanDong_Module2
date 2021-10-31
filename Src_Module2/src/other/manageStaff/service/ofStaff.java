package other.manageStaff.service;

import other.manageStaff.model.Staff;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ofStaff implements IsOfStaff {
    private static List<Staff> staffList = new ArrayList<>();

    public void addStaff() {
        Staff staff = new Staff();

        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập tên Staff cần thêm ");
        String name = (scanner.nextLine());
        staff.setName(name);

        System.out.print("nhập ngày tháng năm sinh Staff ");
        int date = Integer.parseInt(scanner.nextLine());
        staff.setDate(date);

        System.out.print("nhập code của staff ");
        int code = Integer.parseInt(scanner.nextLine());
        staff.setCode(code);

        System.out.print("nhập địa chỉ của Staff ");
        String address = (scanner.nextLine());
        staff.setAddress(address);

        System.out.print("nhập giời công Staff ");
        int workData = Integer.parseInt(scanner.nextLine());
        long salary = workData * 30000;
        staff.setSalary(salary);

        Staff st = new Staff(name, date, code, address, salary);
        staffList.add(st);
        for (int i = 0; i < staffList.size(); i++) {
            System.out.println(staffList.get(i));
        }
        this.addStaff(staff);
    }

    private void addStaff(Staff staff) {
        try {
            FileWriter fileWriter = new FileWriter("Staff.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(staff.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showAll() {
        staffList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("Staff.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] staff = line.split(" ,");
                Staff staff1 = new Staff(staff[0], Integer.parseInt(staff[1]), Integer.parseInt(staff[2]),
                        staff[3], Integer.parseInt(staff[4]));
                staffList.add(staff1);
            }
            bufferedReader.close();
            this.show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void show() {
        System.out.println("staff list");
        for (Staff staff : staffList) {
            System.out.println(staff.getName() + ", " + staff.getDate() + ", " + staff.getCode()
                    + ", " + staff.getAddress() + ", " + staff.getSalary());
        }
    }
    @Override
    public void search() {
        staffList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name for searching");
        String ser = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader("Staff.csv");
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String line;
//            Scanner scanner1 = new Scanner(fileReader);
            while ((line = bufferedReader.readLine())!=null){
                if (line.startsWith(ser)) {
                    String[] staff = line.split(" ,");
                    Staff staff1 = new Staff(staff[0], Integer.parseInt(staff[1]), Integer.parseInt(staff[2]),
                            staff[3], Integer.parseInt(staff[4]));
                    staffList.add(staff1);
                }
            }
            bufferedReader.close();
            this.fin();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void fin() {
        System.out.println("staff list");
        for (Staff staff : staffList) {
            System.out.println(staff.getName() + ", " + staff.getDate() + ", " + staff.getCode()
                    + ", " + staff.getAddress() + ", " + staff.getSalary());
        }
    }
}
