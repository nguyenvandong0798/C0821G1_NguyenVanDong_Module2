package s019_design_pattern.exercise.factory_method;

public class Demo {
    public static void main(String[] args) {
        Shape shape1 =ShapeFactory.getShape(Draw.Circle);
        Shape shape2 =ShapeFactory.getShape(Draw.Square);
        Shape shape3 =ShapeFactory.getShape(Draw.Rectangle);

        System.out.println(shape1.getShape());
        System.out.println(shape2.getShape());
        System.out.println(shape3.getShape());
    }
}

