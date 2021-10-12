package s06_inheritance.exercise.s1_circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder circle = new Cylinder();
        circle = new Cylinder(3.0, 2.0, "Yellow");
        System.out.println(circle);
    }
}
