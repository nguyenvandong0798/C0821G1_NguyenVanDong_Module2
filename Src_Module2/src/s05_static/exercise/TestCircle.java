package s05_static.exercise;

public class TestCircle {
    private  double radius = 1.0;
    private String color = "red";

//    public TestCircle(){
//
//    }
    public TestCircle(double r) {
        this.radius = r;
    }

    private double getRadius() {
        return this.radius;
    }

    private double getArea() {
        return this.radius * this.radius * 3.14;
    }


    public static void main(String[] args) {
        TestCircle circle = new TestCircle(2);
        System.out.println( "radius " + circle.getRadius());
        System.out.println( "area " + circle.getArea());
    }
}
