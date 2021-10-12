package s07_abstrac_and_interface.exercise.esizeable.model;

import s07_abstrac_and_interface.exercise.esizeable.service.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this. radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: " + "getArea = " + getArea()
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * (percent / 50);
    }
}