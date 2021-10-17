package review.DSA.service;


import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String address;
    private int point;
    private Object Student;

    public Object getStudent() {
        return Student;
    }

    public void setStudent(Object student) {
        Student = student;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Student(int id, String name, String address, int point) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}';
    }
    @Override
    public int compareTo(Student student) {
        return getPoint() - student.getPoint();
    }
}
