package other.manageStaff.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void checkDate() {
        Scanner scanner = new Scanner(System.in);
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
    }
}
