package review.manage_candidates.service;

import review.manage_candidates.model.Experience;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IsExperienceService {
    public static List<Experience> experienceArrayList = new ArrayList<>();


    public static void addExperience() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
//            enter name
            System.out.print("enter name ");
            String name = (scanner.nextLine());

//            Check date of birth.
                System.out.print("enter year of birth dd-MM-yyyy ");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date date = dateFormat.parse(scanner.nextLine());


//            enter address
            System.out.print("enter address ");
            String address = (scanner.nextLine());

//            check number of phones
            System.out.println("enter number phone");
            String numberPhone = "";
            while (true) {
                numberPhone = (scanner.nextLine());
                Pattern pattern = Pattern.compile("^[0-9]{10}$");
                if (!(pattern.matcher(numberPhone).find())) {
                    System.out.println("enter again 10  number");
                } else {
                    break;
                }
            }

//            enter email
            System.out.print("enter email ");
            String email = (scanner.nextLine());

//            check year of experience
            int yearOfExperience;
            do {
                System.out.print("enter year Of Experience ");
                yearOfExperience = Integer.parseInt(scanner.nextLine());
            } while (yearOfExperience < 0 || yearOfExperience > 100);

//            enter skill
            System.out.print("enter skill ");
            String proSkill = (scanner.nextLine());
            int type = 0;
            Experience experience = new Experience(name, dateFormat.format(date), address,
                    numberPhone, email, type, yearOfExperience, proSkill);
            experienceArrayList.add(experience);
            for (int i = 0; i < experienceArrayList.size(); i++) {
                System.out.println(experienceArrayList.get(i));
            }

//            enter answer
            System.out.println("Do you want to continue (Y/N)?. ");
            String answer = (scanner.nextLine());
            if (answer.equals("N")) {
                break;
            }
        }
    }

    public static void updateExperience() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter index to update 0->n");
            int index = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < experienceArrayList.size(); i++) {
                if (i == index) {

//                    enter name
                    System.out.print("enter name ");
                    String name = (scanner.nextLine());

//                    enter year of birth
                    System.out.print("enter year of birth dd-MM-yyyy ");
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                    Date date = dateFormat.parse(scanner.nextLine());

//                    enter number phone
                    System.out.println("enter number phone");
                    String numberPhone = "";
                    while (true) {
                        numberPhone = (scanner.nextLine());
                        Pattern pattern = Pattern.compile("^[0-9]{10}$");
                        if (!(pattern.matcher(numberPhone).find())) {
                            System.out.println("enter again 10  number");
                        } else {
                            break;
                        }
                    }

//                    enter address
                    System.out.print("enter address ");
                    String address = (scanner.nextLine());

//                    enter mail
                    System.out.print("enter email ");
                    String email = (scanner.nextLine());

//                check year of experience
                    int yearOfExperience;
                    do {
                        System.out.print("enter year Of Experience ");
                        yearOfExperience = Integer.parseInt(scanner.nextLine());
                    } while (yearOfExperience < 0 || yearOfExperience > 100);

//                    enter skill
                    System.out.print("enter skill ");
                    String proSkill = (scanner.nextLine());
                    int type = 0;


                    experienceArrayList.get(i).setName(name);
                    experienceArrayList.get(i).setYearOfBirth(dateFormat.format(date));
                    experienceArrayList.get(i).setAddress(address);
                    experienceArrayList.get(i).setNumberPhone(numberPhone);
                    experienceArrayList.get(i).setEmail(email);
                    experienceArrayList.get(i).setType(type);
                    experienceArrayList.get(i).setYearOfExperience(yearOfExperience);
                    experienceArrayList.get(i).setProSkill(proSkill);

                    for (int j = 0; j < experienceArrayList.size(); j++) {
                        System.out.println(experienceArrayList.get(j));
                    }
                }
            }

//            enter answer
            System.out.println("Do you want to continue (Y/N)?. ");
            String answer = (scanner.nextLine());
            if (answer.equals("N")) {
                break;
            }
        }
    }

    public static void removeExperience() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter index to remove");
        int index = Integer.parseInt(scanner.nextLine());
        experienceArrayList.remove(index);
        for (int i = 0; i < experienceArrayList.size(); i++) {
            System.out.println(experienceArrayList.get(i));
        }
    }

    public static void displayExperience() {
        System.out.println("=========== Experience ============");
        for (int i = 0; i < experienceArrayList.size(); i++) {
            System.out.println(experienceArrayList.get(i).getName());
        }
    }

    public static void searchExperience() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter key ");
        String key = (scanner.nextLine());
        String patten = ".*" + key + ".*";
        boolean check = false;
        for (int i = 0; i < experienceArrayList.size(); i++) {
            if (experienceArrayList.get(i).getName().matches(patten)) {
                System.out.println(experienceArrayList.get(i));
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("not search in Systems ");
        }
    }
}