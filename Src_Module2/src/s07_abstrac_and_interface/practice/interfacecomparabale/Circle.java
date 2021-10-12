package s07_abstrac_and_interface.practice.interfacecomparabale;

public class Circle {
    private double radius;
    private String color;
    private boolean filter;

    public Circle(){

    }

    public Circle(double radius, String color, boolean filter){
        this.radius = radius;
        this.color = color;
        this.filter = false;
    }

    public Circle(double radius) {
    }

    public double getRadius() {
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

    public boolean isFilter() {
        return filter;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }

    public double getArea (){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " radius = " + getRadius() +
                " color = " + getColor() +
                " filter = " + isFilter();
    }
}
