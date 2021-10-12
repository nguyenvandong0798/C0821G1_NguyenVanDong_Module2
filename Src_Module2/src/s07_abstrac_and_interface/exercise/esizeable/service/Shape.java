package s07_abstrac_and_interface.exercise.esizeable.service;

public class Shape {
    private String color = "Green";
    private boolean filled = false;

    public Shape(){

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return " color " + color +
                ", filled " + (isFilled() ? "filled" : "not_filled");
    }

    public static void printModel(Shape[] model) {
        for (Shape x : model) {
            System.out.println(x.toString());
        }
    }

    public void resize(double percent) {

    }
}
