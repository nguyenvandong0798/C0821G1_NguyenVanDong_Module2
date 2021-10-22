package s013_sort.exercise.insertionsortlist.service;

import review.DSA.model.Student;

import java.util.Scanner;

public class StudentSv implements IsStudentServicee {
    Scanner scanner = new Scanner(System.in);
    private static Student[] studentList = new Student[3];

    static {
        studentList[0] = new Student(5, "Nguyen Van Dong", "Quang Nam", 6);
        studentList[1] = new Student(6, "Dang Huu Du", "Quang Nam", 8);
        studentList[2] = new Student(7, "Nguyen Anh Tam", "Quang Nam", 7);
    }
    @Override
    public void insertSort() {
        for (int i = 0; i < studentList.length; i++){
            Student sort = studentList[i];
            int j = i+1;
            while (j>= 0 && studentList[j].getId()>sort.getId()){
                studentList[j +1] = studentList[j];
                j--;
            }
            studentList[j + 1] = sort;
        }
    }
}
