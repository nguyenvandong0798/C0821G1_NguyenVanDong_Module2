package review.manage_candidates.candidates_service.service;

import review.manage_candidates.model.Intern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InternshipService {
    public static List<Intern> internList = new ArrayList<>();

    public static void addIntern() throws ParseException {
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

//            intern type = 2
            int type = 2;


//            enter majors
            System.out.print("enter majors ");
            String majors = (scanner.nextLine());

//           enter semester
            System.out.print("enter semester ");
            int semester = Integer.parseInt(scanner.nextLine());

//            enter uni
            System.out.print("enter university ");
            String uni = (scanner.nextLine());


            Intern intern = new Intern(name, dateFormat.format(date), address,
                    numberPhone, email, type, majors, semester, uni);
            internList.add(intern);
            for (int i = 0; i < internList.size(); i++) {
                System.out.println(internList.get(i));
            }
//            enter answer
            System.out.println("Do you want to continue (Y/N)?. ");
            String answer = (scanner.nextLine());
            if (answer.equals("N")) {
                break;
            }
        }
    }

    public static void updateFresher() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter index to update 0->n");
            int index = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < internList.size(); i++) {
                if (i == index) {

//                    enter name
                    System.out.print("enter name ");
                    String name = (scanner.nextLine());

//                    eneter year of birth
                    System.out.print("enter year of birth ");
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

//                    enetr address
                    System.out.print("enter address ");
                    String address = (scanner.nextLine());

//                    enter email
                    System.out.print("enter email ");
                    String email = (scanner.nextLine());

                    int type = 0;

//                    enter major
                    System.out.print("enter major ");
                    String major = (scanner.nextLine());


//                    enter semester
                    System.out.println("enter semester ");
                    int semester = Integer.parseInt(scanner.nextLine());

//                    university
                    System.out.println("enter university ");
                    String uni = (scanner.nextLine());


                    internList.get(i).setName(name);
                    internList.get(i).setYearOfBirth(dateFormat.format(date));
                    internList.get(i).setAddress(address);
                    internList.get(i).setNumberPhone(numberPhone);
                    internList.get(i).setEmail(email);
                    internList.get(i).setType(type);
                    internList.get(i).setMajors(major);
                    internList.get(i).setSemester(semester);
                    internList.get(i).setUni(uni);

                    for (int j = 0; j < internList.size(); j++) {
                        System.out.println(internList.get(j));
                    }

//                      enter answer
                    System.out.println("Do you want to continue (Y/N)?. ");
                    String answer = (scanner.nextLine());
                    if (answer.equals("N")) {
                        break;
                    }
                }
            }
        }
    }

    public static void removeFresher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter index");
        int index = Integer.parseInt(scanner.nextLine());
        internList.remove(index);
        for (int i =0; i < internList.size(); i++){
            System.out.println(internList.get(i));
        }
    }


    public static void displayIntern() {
        System.out.println("=========== Internship ==============");
        for (int i = 0;i<internList.size();i++){
            System.out.println(internList.get(i).getName());
        }
    }

    public static void searchIntern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter key ");
        String key = (scanner.nextLine());
        String patten = ".*"+key+".*";
        boolean check = false;
        for(int i =0;i<internList.size();i++){
            if (internList.get(i).getName().matches(patten)){
                System.out.println(internList.get(i));
                check = true;
                break;
            }
        }if (check == false){
            System.out.println("not search in Systems ");
        }
    }
}
