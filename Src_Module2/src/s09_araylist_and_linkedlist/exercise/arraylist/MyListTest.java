package s09_araylist_and_linkedlist.exercise.arraylist;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

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
        public void getIdName(int id, String name){
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Dong");
        Student b = new Student(2, "hai");
        Student c = new Student(3, "ly");
        Student d = new Student(4, "na");
        Student e = new Student(5, "ver");
        Student f = new Student(6, "bob");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.isAdd(a);
        studentMyList.isAdd(b);
        studentMyList.isAdd(c);
        studentMyList.isAdd(d);
        studentMyList.isAdd(e);
        studentMyList.add(2, f);
//        studentMyList.clear();

        for (int i = 0; i < studentMyList.getSize(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
}
