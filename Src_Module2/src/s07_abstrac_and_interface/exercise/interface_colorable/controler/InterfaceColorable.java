package s07_abstrac_and_interface.exercise.interface_colorable.controler;

import s07_abstrac_and_interface.exercise.esizeable.model.Rectangle;
import s07_abstrac_and_interface.exercise.esizeable.model.Square;
import s07_abstrac_and_interface.exercise.esizeable.service.Shape;
import s07_abstrac_and_interface.exercise.interface_colorable.service.Colorable;

public class InterfaceColorable {
    public static void main(String[] args) {
        Shape[] models = new Shape[2];
        models[0] = new Square("Yellow", true, 5);
        models[1] = new Rectangle(5.5, 5.5);
        for (Shape shape : models) {
            System.out.println(shape.toString());

            if (shape instanceof Square) {
                Colorable colorable = (Square) shape;
                System.out.println(colorable.howToColor());
            }
        }
    }
}