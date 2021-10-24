package review.manage_candidates.service;

import review.DSA.service.IsStudentService;
import review.manage_candidates.model.Fresher;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IsFresherService {

    public static List<Fresher> fresherArrayList = new ArrayList<>();


    public static void addFresher() throws ParseException {
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
            System.out.print("enter address  ");
            String address = (scanner.nextLine());

//            check number of phones
            System.out.print("enter number phone");
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

//            fresher type =1
            int type = 1;

//            check year graduation
            System.out.print("enter year graduation dd-MM-yyyy ");
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            Date ofData = dateFormat.parse(scanner.nextLine());

//            enter Rank
            System.out.print("enter rank ");
            String rank = (scanner.nextLine());

//            university
            System.out.print("enter university ");
            String uni = (scanner.nextLine());

//            university where
            System.out.print("enter university where ");
            String uniWhere = (scanner.nextLine());

            Fresher fresher = new Fresher(name, dateFormat.format(date), address,
                    numberPhone, email, type, dateFormat.format(ofData), rank, uni, uniWhere);
            fresherArrayList.add(fresher);
            for (int i = 0; i < fresherArrayList.size(); i++) {
                System.out.println(fresherArrayList.get(i));
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
            for (int i = 0; i < fresherArrayList.size(); i++) {
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

//                    Year graduations
                    System.out.print("enter year of birth ");
                    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                    Date ofDate = df.parse(scanner.nextLine());

//                    Type degree
                    System.out.println("enter type of degree");
                    String rank = (scanner.nextLine());

//                    university
                    System.out.println("enter university");
                    String uni = (scanner.nextLine());

//                    university where
                    System.out.println("enter university where");
                    String uniWhere = (scanner.nextLine());

                    fresherArrayList.get(i).setName(name);
                    fresherArrayList.get(i).setYearOfBirth(dateFormat.format(date));
                    fresherArrayList.get(i).setAddress(address);
                    fresherArrayList.get(i).setNumberPhone(numberPhone);
                    fresherArrayList.get(i).setEmail(email);
                    fresherArrayList.get(i).setType(type);
                    fresherArrayList.get(i).setGraduationYear(dateFormat.format(ofDate));
                    fresherArrayList.get(i).setRank(rank);
                    fresherArrayList.get(i).setUni(uni);
                    fresherArrayList.get(i).setUniWhere(uniWhere);

                    for (int j = 0; j < fresherArrayList.size(); j++) {
                        System.out.println(fresherArrayList.get(j));
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
        int index = Integer.parseInt(scanner.nextLine());
        fresherArrayList.remove(index);
        for (int i = 0; i < fresherArrayList.size(); i++) {
            System.out.println(fresherArrayList.get(i));
        }
    }

    public static void displayFresher() {
        System.out.println("=========== Fresher ============");
        for (int i= 0; i <fresherArrayList.size(); i++){
            System.out.println(fresherArrayList.get(i).getName());
        }
    }

    public static void searchFresher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter key ");
        String key = (scanner.nextLine());
        String patten = ".*"+key+".*";
        boolean check = false;
        for(int i =0;i<fresherArrayList.size();i++){
            if (fresherArrayList.get(i).getName().matches(patten)){
                System.out.println(fresherArrayList.get(i));
                check = true;
                break;
            }
        }if (check == false){
            System.out.println("not search in Systems ");
        }
    }
}

