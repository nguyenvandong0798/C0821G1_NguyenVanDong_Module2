package review.manage_candidates.controller;

import review.manage_candidates.service.inter.IsFresherService;
import review.manage_candidates.service.is_service.ExperienceService;
import review.manage_candidates.service.inter.IsExperienceService;
import review.manage_candidates.service.is_service.FresherService;
import review.manage_candidates.service.is_service.InternshipService;

import java.text.ParseException;
import java.util.Scanner;

public class ManagementsSystem {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        IsExperienceService isExperienceService =new ExperienceService();
        IsFresherService isFresherService = new FresherService();
        while (true) {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("0. Exit");
            System.out.println(" (Please choose 1 to Create Experience Candidate, " +
                    "2 to Create Fresher Candidate, " + "\n" +
                    "3 to Internship Candidate, " +
                    "4 to Searching and " +
                    "0 to Exit program)." + "\n");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                System.out.println("Exit out System");
                break;
            }
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("1: add file Experience");
                        System.out.println("2: update Experience");
                        System.out.println("3: remove Experience");
                        System.out.println("4: Show file Experience");
                        System.out.println("5: Find file Experience");
                        System.out.println("0: Exit");
                        int optionExperience = Integer.parseInt(scanner.nextLine());
                        if (optionExperience == 0) {
                            break;
                        }
                        switch (optionExperience) {
                            case 1:
                                isExperienceService.addExperience();
                                break;
                            case 2:
                                isExperienceService.updateExperience();
                                break;
                            case 3:
                                isExperienceService.removeExperience();
                                break;
                            case 4:
                                isExperienceService.showExperience();
                                break;
                            case 5:
                                isExperienceService.findExperience();
                                break;
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("1: add file Fresher");
                        System.out.println("2: update Fresher");
                        System.out.println("3: remove Fresher");
                        System.out.println("4: Show file Fresher");
                        System.out.println("5: Find file Fresher");
                        System.out.println("0: Exit");
                        int optionFresher = Integer.parseInt(scanner.nextLine());
                        if (optionFresher == 0) {
                            break;
                        }
                        switch (optionFresher) {
                            case 1:
                                isFresherService.addFresher();
                                break;
                            case 2:
                                isFresherService.updateFresher();
                                break;
                            case 3:
                                isFresherService.removeFresher();
                                break;
                            case 4:
                                isFresherService.showFresher();
                                break;
                            case 5:
                                isFresherService.findFresher();
                                break;
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println("1: add intern");
                        System.out.println("2: update intern");
                        System.out.println("3: remove intern");
                        System.out.println("5: Exit");
                        int optionIntern = Integer.parseInt(scanner.nextLine());
                        if (optionIntern == 5) {
                            break;
                        }
                        switch (optionIntern) {
                            case 1:
                                InternshipService.addIntern();
                                break;
                            case 2:
                                InternshipService.updateFresher();
                                break;
                            case 3:
                                InternshipService.removeFresher();
                                break;
                        }
                    }
                    break;

                case 4:
                    while (true) {
                        ExperienceService.displayExperience();
                        FresherService.displayFresher();
                        InternshipService.displayIntern();

                        System.out.println("option search" + "\n");
                        System.out.println("1: Search Experience");
                        System.out.println("2: Search Fresher");
                        System.out.println("3: Search intern");
                        System.out.println("5: Exit");
                        Scanner sc = new Scanner(System.in);
                        int choiceSearch = Integer.parseInt(sc.nextLine());
                        if (choiceSearch==5){
                            break;
                        }
                        switch (choiceSearch) {
                            case 1:
                                ExperienceService.searchExperience();
                                break;
                            case 2:
                                FresherService.searchFresher();
                                break;
                            case 3:
                                InternshipService.searchIntern();
                                break;
                        }
                    }
            }
        }
    }
}

