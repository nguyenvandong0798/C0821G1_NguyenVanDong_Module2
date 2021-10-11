package s06_inheritance.exercise.s3_point_movepoint;

public class MainMovePoint {
    public static void main(String[] args) {
        System.out.println("Point");
        Point point = new Point(2.0f,5.6f);
        System.out.println(point);

        System.out.println("move point");
        MovePoint movePoint = new MovePoint( 2.0f,5.6f,5.5f,5.5f);
        System.out.println(movePoint);

        System.out.println("Return move Point ");
        System.out.println(movePoint.move());
    }
}
