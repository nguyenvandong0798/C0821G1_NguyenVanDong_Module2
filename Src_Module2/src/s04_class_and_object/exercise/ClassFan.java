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
            System.out.println("fan:");
            inf = "speed " + FAST + "radius " + radius +" color " +color + "status " + status;
        }else{
            inf = "speed" + MEDIUM + "radius " + radius +" color" + "yellow" + "status" + status;
        }
        return inf;
    }



    public static void main(String[] args) {
        ClassFan fan = new ClassFan();
        fan.setSpeed(fan.FAST);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);
        System.out.println(fan);

    }
}
