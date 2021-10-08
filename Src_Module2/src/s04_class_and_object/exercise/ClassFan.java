package s04_class_and_object.exercise;

import java.sql.SQLOutput;
import java.util.Set;

public class ClassFan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    public boolean status = false;
    private int speed = SLOW;
    private double radius = 5;
    private String color = "blue";


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return status;
    }

    public void setOn(boolean on) {
        this.status = on;
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


    public String toString(){
        String inf = "";
        if (this.status){
            System.out.println("fant 1:");
            inf = "speed " + FAST + "radius " + radius +" color " +color + "status " + status;
        }else{
            inf = "speed" + MEDIUM + "radius " + radius +" color" + "yellow" + "status" + status;
        }
        return inf;
    }



    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1);

    }
}
