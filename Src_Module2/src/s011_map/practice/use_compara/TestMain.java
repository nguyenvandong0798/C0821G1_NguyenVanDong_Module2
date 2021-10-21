package s011_map.practice.use_compara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        Student student1 = new Student("NA",12,"QN");
        Student student2 = new Student("NGUYEN",30,"QN");
        Student student3 = new Student("TAM",20,"QN");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student s: list) {
            System.out.println(s.toString());
        }

        System.out.println("\n" + "--------------------------" + "\n");

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
