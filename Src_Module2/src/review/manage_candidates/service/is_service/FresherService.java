package review.manage_candidates.service.is_service;

import review.DSA.service.IsStudentService;
import review.manage_candidates.model.Experience;
import review.manage_candidates.model.Fresher;
import review.manage_candidates.service.inter.IsFresherService;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FresherService implements IsFresherService {

    public static List<Fresher> fresherArrayList = new ArrayList<>();

    @Override
    public void addFresher() {
        Scanner scanner = new Scanner(System.in);
        Fresher fresher =new Fresher();
        while (true) {

//            enter name
            System.out.print("enter name ");
            String name = (scanner.nextLine());
            fresher.setName(name);

//            Check date of birth.
            System.out.print("enter year of birth dd-MM-yyyy ");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = null;
            try {
                date = dateFormat.parse(scanner.nextLine());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            fresher.setYearOfBirth(dateFormat.format(date));

//            enter address
            System.out.print("enter address  ");
            String address = (scanner.nextLine());
            fresher.setAddress(address);

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
            fresher.setNumberPhone(numberPhone);

//            enter email
            System.out.print("enter email ");
            String email = (scanner.nextLine());
            fresher.setEmail(email);

//            fresher type =1
            int type = 1;
            fresher.setType(type);

//            check year graduation
            System.out.print("enter year graduation dd-MM-yyyy ");
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            Date ofData = null;
            try {
                ofData = df.parse(scanner.nextLine());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            fresher.setGraduationYear(dateFormat.format(ofData));

//            enter Rank
            System.out.print("enter rank ");
            String rank = (scanner.nextLine());
            fresher.setRank(rank);

//            university
            System.out.print("enter university ");
            String uni = (scanner.nextLine());
            fresher.setUni(uni);

//            university where
            System.out.print("enter university where ");
            String uniWhere = (scanner.nextLine());
            fresher.setUniWhere(uniWhere);

            Fresher fresher1 = new Fresher(name, dateFormat.format(date), address,
                    numberPhone, email, type, dateFormat.format(ofData), rank, uni, uniWhere);
            fresherArrayList.add(fresher1);
            for (int i = 0; i < fresherArrayList.size(); i++) {
                System.out.println(fresherArrayList.get(i));
            }

//            writer to file
            this.writerFile(fresher);

//            enter answer
            System.out.println("Do you want to continue (Y/N)?. ");
            String answer = (scanner.nextLine());
            if (answer.equals("N")) {
                break;
            }
        }
    }

    private void writerFile(Fresher fresher) {
        try {
            FileWriter fileWriter = new FileWriter("src\\review\\manage_candidates\\file\\csv\\fresher.csv",true);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            bufferedWriter.write(fresher.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showFresher() {
        fresherArrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src\\review\\manage_candidates\\file\\csv\\fresher.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fresher = line.split(", ");
                Fresher fresher1 = new Fresher(fresher[0], fresher[1], fresher[2],
                        fresher[3], fresher[4],Integer.parseInt(fresher[5]), fresher[6],fresher[7],fresher[8],fresher[9]);
                fresherArrayList.add(fresher1);
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
        System.out.println("experience list");
        for (Fresher fresher : fresherArrayList) {
            System.out.println(fresher.getName() + ", " + fresher.getYearOfBirth() + ", " + fresher.getAddress()
                    + ", " + fresher.getEmail() + ", " + fresher.getType()+ ", " + fresher.getGraduationYear()
                    + ", " + fresher.getRank()+ ", " + fresher.getUni()+ ", " + fresher.getUniWhere());
        }
    }


    @Override
    public void findFresher() {
        fresherArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name for searching");
        String search = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader("src\\review\\manage_candidates\\file\\csv\\fresher.csv");
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String line;
//            Scanner scanner1 = new Scanner(fileReader);
            while ((line = bufferedReader.readLine())!=null){
                if (line.startsWith(search)) {
                    String[] fresher = line.split(", ");
                    Fresher fresher1 = new Fresher(fresher[0], fresher[1], fresher[2],
                            fresher[3], fresher[4],Integer.parseInt(fresher[5]), fresher[6],fresher[7],fresher[8],fresher[9]);
                    fresherArrayList.add(fresher1);
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
        System.out.println("fresher list");
        for (Fresher fresher : fresherArrayList) {
            System.out.println(fresher.getName() + ", " + fresher.getYearOfBirth() + ", " + fresher.getAddress()
                    + ", " + fresher.getEmail() + ", " + fresher.getType()+ ", " + fresher.getGraduationYear()
                    + ", " + fresher.getRank()+ ", " + fresher.getUni()+ ", " + fresher.getUniWhere());
        }
    }

    @Override
    public void updateFresher() {
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
                    Date date = null;
                    try {
                        date = dateFormat.parse(scanner.nextLine());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

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
                    Date ofDate = null;
                    try {
                        ofDate = df.parse(scanner.nextLine());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

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

    @Override
    public void removeFresher() {
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

