package s05_static.exercise;

public class Main {
    public static void main(String[] args) {
        ClassStudent student = new ClassStudent();
        student.setName("Dong");
        student.setClasses("C08");
        System.out.println("name is: " + student.name );
        System.out.println("classes is: " + student.classes );
    }
}
