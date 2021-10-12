package s07_abstrac_and_interface.exercise.esizeable.controler;

import s07_abstrac_and_interface.exercise.esizeable.model.Circle;
import s07_abstrac_and_interface.exercise.esizeable.service.Shape;
import s07_abstrac_and_interface.exercise.esizeable.model.Rectangle;
import s07_abstrac_and_interface.exercise.esizeable.model.Square;

public class Test {
    public static void main(String[] args) {
        int a = (int) Math.floor(Math.random() * 10);
        Shape[] models = new Shape[3];
        models[0] = new Circle(a, "yellow", false);
        models[1] = new Rectangle( "green",true, a, a);
        models[2] = new Square("melinda", true,a);
        for (Shape n : models){
            System.out.println(n);
        }

        for (Shape n : models) {
            n.resize(Math.random() * 100);
        }
        System.out.println("\n");
        Shape.printModel(models);
    }
}

