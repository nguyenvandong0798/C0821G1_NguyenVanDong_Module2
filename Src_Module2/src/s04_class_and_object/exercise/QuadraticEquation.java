package s04_class_and_object.exercise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c, delta;

    public QuadraticEquation(double a, double b, double c, double delta) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = delta;
    }

    public double getRoot() {return this.b/(this.a*2);}
    public double getRoot1() {return (-this.b) + Math.pow(this.delta, 0.5)/2*this.a;}
    public double getRoot2() {return (-this.b) - Math.pow(this.delta, 0.5)/2*this.a;}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value a:");
        double a =scanner.nextDouble();
        System.out.print("enter in value b:");
        double b = scanner.nextDouble();
        System.out.print("enter in value c:");
        double c = scanner.nextDouble();
        double detal = b*b -4*a*c;
        if (detal == 0){
            QuadraticEquation tar = new QuadraticEquation(a,b,c,detal);
                    System.out.println("st: " + tar.getRoot());
        }
        if (detal > 0){
            QuadraticEquation tar = new QuadraticEquation(a,b,c,detal);
            System.out.println("Root1 is:" + tar.getRoot1());
            System.out.println("Root2 is:" + tar.getRoot2());
        }else{
            System.out.println("the equation has is roots");
        }
    }
}
