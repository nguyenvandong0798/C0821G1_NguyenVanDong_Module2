package review.manage_candidates.controller;

import review.manage_candidates.service.IsExperienceService;
import review.manage_candidates.service.IsFresherService;
import review.manage_candidates.service.IsInternshipService;

import java.text.ParseException;
import java.util.Scanner;

public class ManagementsSystem {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
//        CandidateService candidateService = new IsCandidateService();
        while (true) {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            System.out.println(" (Please choose 1 to Create Experience Candidate, " +
                    "2 to Create Fresher Candidate, " + "\n" +
                    "3 to Internship Candidate, " +
                    "4 to Searching and " +
                    "5 to Exit program)." + "\n");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 5) {
                System.out.println("Exit out System");
                break;
            }
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("1: add Experience");
                        System.out.println("2: update Experience");
                        System.out.println("3: remove Experience");
                        System.out.println("5: Exit");
                        int optionExperience = Integer.parseInt(scanner.nextLine());
                        if (optionExperience == 5) {
                            break;
                        }
                        switch (optionExperience) {
                            case 1:
                                IsExperienceService.addExperience();
                                break;
                            case 2:
                                IsExperienceService.updateExperience();
                                break;
                            case 3:
                                IsExperienceService.removeExperience();
                                break;
                            case 4:
                                IsExperienceService.searchExperience();
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("1: add Fresher");
                        System.out.println("2: update Fresher");
                        System.out.println("3: remove Fresher");
                        System.out.println("5: Exit");
                        int optionFresher = Integer.parseInt(scanner.nextLine());
                        if (optionFresher == 5) {
                            break;
                        }
                        switch (optionFresher) {
                            case 1:
                                IsFresherService.addFresher();
                                break;
                            case 2:
                                IsFresherService.updateFresher();
                                break;
                            case 3:
                                IsFresherService.removeFresher();
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
                                IsInternshipService.addIntern();
                                break;
                            case 2:
                                IsInternshipService.updateFresher();
                                break;
                            case 3:
                                IsInternshipService.removeFresher();
                                break;
                        }
                    }
                    break;

                case 4:
                    while (true) {
                        IsExperienceService.displayExperience();
                        IsFresherService.displayFresher();
                        IsInternshipService.displayIntern();

                        System.out.println("option search" + "\n");
                        System.out.println("1: Search Experience");
                        System.out.println("2: Search Fresher");
                        System.out.println("3: Search intern");
                        Scanner sc = new Scanner(System.in);
                        int choiceSearch = Integer.parseInt(sc.nextLine());
                        switch (choiceSearch) {
                            case 1:
                                IsExperienceService.searchExperience();
                                break;
                            case 2:
                                IsFresherService.searchFresher();
                                break;
                            case 3:
                                IsInternshipService.searchIntern();
                                break;
                        }
                    }
            }
        }
    }
}

