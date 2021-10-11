package s06_inheritance.exercise.s1_circle;

public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double isRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea (){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " color= " + getColor();
    }
}
