package s06_inheritance.exercise.s3_point_movepoint;

public class TestMovePoint {
    public static void main(String[] args) {
        System.out.println("move point");
        MoveAblePoint moveAblePoint = new MoveAblePoint( 2.0f,5.6f,5.5f,5.5f);
        System.out.println(moveAblePoint);

        moveAblePoint.move();
        System.out.println(moveAblePoint);

    }
}
