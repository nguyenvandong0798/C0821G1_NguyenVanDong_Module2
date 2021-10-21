package s011_map.practice.use_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestMain {
    public static void main(String[] args) {
        Student student1 = new Student("dong", 23, "quang nam");
        Student student2 = new Student("du", 20, "quang nam");
        Student student3 = new Student("tam", 18, "quang nam");
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        for (Map.Entry<Integer, Student> student: studentMap.entrySet()) {
            System.out.println(student.toString());
        }


        System.out.println("---------------------------------------");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
