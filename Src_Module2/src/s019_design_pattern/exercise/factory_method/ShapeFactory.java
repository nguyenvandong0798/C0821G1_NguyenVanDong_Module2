package s019_design_pattern.exercise.factory_method;

public class ShapeFactory {
    private ShapeFactory(){};
    public static Shape getShape(Draw draw){
        switch (draw){
            case Circle:
                 return new Circle();
            case Square:
                return new Square();
            case Rectangle:
                return new Rectangle();
            default:
                throw new RuntimeException("NOT SHAPE");
        }
    }
}
