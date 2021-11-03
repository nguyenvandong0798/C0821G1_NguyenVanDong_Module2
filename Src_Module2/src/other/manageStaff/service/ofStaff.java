package other.manageStaff.service;

import other.manageStaff.model.Staff;
import other.manageStaff.utils.Regex;
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

            System.out.print("nhập id của bạn ");
            int id = Integer.parseInt(scanner.nextLine());
            staff.setId(id);

            System.out.print("nhập tên Staff cần thêm ");
            String name;
            while (true) {
                name = (scanner.nextLine());
                try {
                    if (!(Pattern.matches("^[a-zA-Z ]{4,30}$", name))) {
                        throw new Exception("not suitable enter least 4 character: ");
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
            String date;
            while (true) {
                date = (scanner.nextLine());
                try {
                    if (!(Pattern.matches("^[0-9]{2}(\\/)[0-9]{2}(\\/)[0-9]{4}$", date))) {
                        throw new Exception("not suitable enter DD/MM/YYYY again: ");
                    }
                    break;
                } catch (Exception e) {
                    {
                        System.out.println(e.getMessage());
                    }
                }
            }
            staff.setDate(date);

            System.out.print("nhập code của staff ");
            String code;
            while (true) {
                code = (scanner.nextLine());
                try {
                    if (!(Pattern.matches("^MS[0-9]{4}$", code))) {
                        throw new Exception("not suitable enter MS(4 number) again: ");
                    }
                    break;
                } catch (Exception e) {
                    {
                        System.out.println(e.getMessage());
                    }
                }
            }
            staff.setCode(code);

            System.out.print("nhập địa chỉ của Staff ");
            String address = (scanner.nextLine());
            staff.setAddress(address);

            System.out.print("nhập sđt ");
            String number;
            while (true) {
                number = (scanner.nextLine());
                try {
                    if (!(Pattern.matches("^(03|09)[0-9]{8}$", number))) {
                        throw new Exception("not suitable enter start 03 or 09 (10 number) again: ");
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
            if (choice.equals("N")) {
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
                String[] staff = line.split(",");
                Staff staff1 = new Staff(Integer.parseInt(staff[0]), staff[1], staff[2], staff[3],
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
                    String[] staff = line.split(",");
                    Staff staff1 = new Staff(Integer.parseInt(staff[0]), staff[1], staff[2], staff[3],
                            staff[4], staff[5]);
                    staffList.add(staff1);
                }
            }
            bufferedReader.close();
            this.find();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void find() {
        System.out.println("staff list");
        for (Staff staff : staffList) {
            System.out.println(staff.getId() + ", " + staff.getName() + ", " + staff.getDate() + ", " + staff.getCode()
                    + ", " + staff.getAddress() + ", " + staff.getNumberPhone());
        }
    }


    @Override
    public void remove() {
        staffList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src\\other\\manageStaff\\file\\Staff.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] staff = line.split(",");
                Staff staff1 = new Staff(Integer.parseInt(staff[0]), staff[1], staff[2], staff[3],
                        staff[4], staff[5]);
                staffList.add(staff1);
            }
            bufferedReader.close();
            this.delete();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter index to delete ");
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println("are you sure");
        staffList.remove(input);
        for (Staff staff : staffList) {
            System.out.println(staff.getId() + ", " + staff.getName() + ", " + staff.getDate() + ", " + staff.getCode()
                    + ", " + staff.getAddress() + ", " + staff.getNumberPhone());
        }
    }
}
