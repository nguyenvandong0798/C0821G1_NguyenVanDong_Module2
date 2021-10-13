package s07_abstrac_and_interface.exercise.esizeable.model;

import s07_abstrac_and_interface.exercise.esizeable.service.Resizeable;
import s07_abstrac_and_interface.exercise.esizeable.service.Shape;
import s07_abstrac_and_interface.exercise.interface_colorable.service.Colorable;

public class Square extends Shape implements Resizeable,Colorable {

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

    @Override
    public String howToColor() {
        return " Color all four sides..";
    }
}
