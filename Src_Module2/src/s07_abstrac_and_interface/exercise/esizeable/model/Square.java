package s07_abstrac_and_interface.exercise.esizeable.model;

import s07_abstrac_and_interface.exercise.esizeable.service.Shape;

public class Square extends Shape {

    public double side = 1.0d;

    public Square( String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Square : " + "getSquare = " + getArea()
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side = this.side * (percent / 50);
    }
}
