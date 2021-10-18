package s09_araylist_and_linkedlist.exercise.arraylist;

public class MyArrayListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "dong");
        Student b = new Student(2, "ly");
        Student c = new Student(3, "nguyen");
        Student d = new Student(4, "tan");
        Student e = new Student(5, "na");
        Student f = new Student(6, "vy");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(f,2);
//        studentMyArrayList.clear();
        studentMyArrayList.size();
//        System.out.println(studentMyArrayList.size());
//        System.out.println(studentMyArrayList.get(3).getName());
//        System.out.println(studentMyArrayList.indexOf(f));
//        System.out.println(studentMyArrayList.contains(f));
//
//
//        for (int i = 0; i < studentMyArrayList.size();i++){
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
        newMyArrayList = studentMyArrayList.clone();
        newMyArrayList.remove(3);
        Student student = newMyArrayList.remove(3);
        System.out.println(student.getName());

        for (int i = 0; i < newMyArrayList.size();i++){
            System.out.println(newMyArrayList.get(i).getName());
        }
    }
}
