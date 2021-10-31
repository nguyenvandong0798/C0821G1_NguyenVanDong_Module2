package review.manage_candidates.service.is_service;

import review.manage_candidates.model.Experience;
import review.manage_candidates.service.inter.IsExperienceService;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExperienceService implements IsExperienceService {
    public static List<Experience> experienceArrayList = new ArrayList<>();


    public void addExperience(){
        Scanner scanner = new Scanner(System.in);
        Experience experience = new Experience();
        while (true) {
//            enter name
            System.out.print("enter name ");
            String name = (scanner.nextLine());
            experience.setName(name);


//            Check date of birth.
            System.out.print("enter year of birth dd-MM-yyyy ");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = null;
            try {
                date = dateFormat.parse(scanner.nextLine());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            experience.setYearOfBirth(dateFormat.format(date));


//            enter address
            System.out.print("enter address ");
            String address = (scanner.nextLine());
            experience.setAddress(address);

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
            experience.setNumberPhone(numberPhone);

//            enter email
            System.out.print("enter email ");
            String email = (scanner.nextLine());
            experience.setEmail(email);

//            check year of experience
            int yearOfExperience;
            do {
                System.out.print("enter year Of Experience ");
                yearOfExperience = Integer.parseInt(scanner.nextLine());
            } while (yearOfExperience < 0 || yearOfExperience > 100);
            experience.setYearOfExperience(yearOfExperience);

//            enter skill
            System.out.print("enter skill ");
            String proSkill = (scanner.nextLine());
            experience.setProSkill(proSkill);

            int type = 0;
            Experience experience1 = new Experience(name, dateFormat.format(date), address,
                    numberPhone, email, type, yearOfExperience, proSkill);
            experienceArrayList.add(experience1);
            for (int i = 0; i < experienceArrayList.size(); i++) {
                System.out.println(experienceArrayList.get(i));
            }

//            write to file experience
            this.writerFile(experience);

//            enter answer
            System.out.println("Do you want to continue (Y/N)?. ");
            String answer = (scanner.nextLine());
            if (answer.equals("N")) {
                break;
            }
        }
    }


    private void writerFile(Experience experience) {
        try {
            FileWriter fileWriter = new FileWriter("src\\review\\manage_candidates\\file\\csv\\experience.csv",true);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            bufferedWriter.write(experience.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showExperience() {
        experienceArrayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src\\review\\manage_candidates\\file\\csv\\experience.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] experience = line.split(", ");
                Experience experience1 = new Experience(experience[0], experience[1], experience[2],
                        experience[3], experience[4],Integer.parseInt(experience[5]), Integer.parseInt(experience[6]),experience[7]);
                experienceArrayList.add(experience1);
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
        for (Experience experience : experienceArrayList) {
            System.out.println(experience.getName() + ", " + experience.getYearOfBirth() + ", " + experience.getAddress()
                    + ", " + experience.getEmail() + ", " + experience.getType()+ ", " + experience.getYearOfExperience()
                    + ", " + experience.getProSkill());
        }
    }

    @Override
    public void findExperience() {
        experienceArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name for searching");
        String search = scanner.nextLine();

        try {
            FileReader fileReader = new FileReader("src\\review\\manage_candidates\\file\\csv\\experience.csv");
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String line;
//            Scanner scanner1 = new Scanner(fileReader);
            while ((line = bufferedReader.readLine())!=null){
                if (line.startsWith(search)) {
                    String[] experience = line.split(", ");
                    Experience experience1 = new Experience(experience[0], experience[1], experience[2],
                            experience[3], experience[4],Integer.parseInt(experience[5]), Integer.parseInt(experience[6]),experience[7]);
                    experienceArrayList.add(experience1);
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
        System.out.println("experience list");
        for (Experience experience : experienceArrayList) {
            System.out.println(experience.getName() + ", " + experience.getYearOfBirth() + ", " + experience.getAddress()
                    + ", " + experience.getEmail() + ", " + experience.getType()+ ", " + experience.getYearOfExperience()
                    + ", " + experience.getProSkill());
        }
    }



    @Override
    public void updateExperience() {
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

    @Override
    public void removeExperience() {
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