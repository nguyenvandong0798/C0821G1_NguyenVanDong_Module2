package other.manageStaff.service;

import other.manageStaff.model.Staff;
import s019_design_pattern.practice.singleton.BookBorrower;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ofStaff implements IsOfStaff {
    private static List<Staff> staffList = new ArrayList<>();

    public void addStaff() {
        while (true) {
            Staff staff = new Staff();

            Scanner scanner = new Scanner(System.in);

//        System.out.print("nhập id của bạn ");
            int id = 0;
            staff.setId(id);

            System.out.print("nhập tên Staff cần thêm ");
            String name;
            while (true) {
                name = (scanner.nextLine());
                try {
                    if (!(Pattern.matches("^[a-zA-Z ]{4,30}$", name))) {
                        throw new Exception("not suitable enter again: ");
                    }
                    break;
                } catch (Exception e) {
                    {
                        System.out.println(e.getMessage());
                    }
                }
            }
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

            System.out.print("nhập sđt ");
            String number;
            while (true) {
                number = (scanner.nextLine());
                try {
                    if (!(Pattern.matches("^09| 03+[0-9]{8}$", number))) {
                        throw new Exception("not suitable enter again: ");
                    }
                    break;
                } catch (Exception e) {
                    {
                        System.out.println(e.getMessage());
                    }
                }
            }
            staff.setNumberPhone(number);

            Staff st = new Staff(id, name, date, code, address, number);
            staffList.add(st);
            for (int i = 0; i < staffList.size(); i++) {
                System.out.println(staffList.get(i));
            }
            this.addStaff(staff);

            System.out.println("do you want continuen ");
            String choice = (scanner.nextLine());
            if (choice.equals("N")){
                break;
            }
        }
    }

    private void addStaff(Staff staff) {
        try {
            FileWriter fileWriter = new FileWriter("src\\other\\manageStaff\\file\\Staff.csv", true);
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
            FileReader fileReader = new FileReader("src\\other\\manageStaff\\file\\Staff.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] staff = line.split(" ,");
                Staff staff1 = new Staff(Integer.parseInt(staff[0]),staff[1], Integer.parseInt(staff[2]), Integer.parseInt(staff[3]),
                        staff[4], staff[5]);
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
            System.out.println(staff.getId() + ", " + staff.getName() + ", " + staff.getDate() + ", " + staff.getCode()
                    + ", " + staff.getAddress() + ", " + staff.getNumberPhone());
        }
    }

    @Override
    public void search() {
        staffList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name for searching");
        String ser = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader("src\\other\\manageStaff\\file\\Staff.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
//            Scanner scanner1 = new Scanner(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(ser)) {
                    String[] staff = line.split(" ,");
                    Staff staff1 = new Staff(Integer.parseInt(staff[0]),staff[1], Integer.parseInt(staff[2]), Integer.parseInt(staff[3]),
                            staff[4], staff[5]);
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
            System.out.println(staff.getId() + ", " + staff.getName() + ", " + staff.getDate() + ", " + staff.getCode()
                    + ", " + staff.getAddress() + ", " + staff.getNumberPhone());
        }
    }
}
