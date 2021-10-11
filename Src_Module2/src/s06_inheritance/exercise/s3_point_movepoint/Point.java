package s06_inheritance.exercise.s3_point_movepoint;

import java.util.Arrays;

public class Point {
    float x = 0.0f;
    float y = 0.0f;

    public Point(){

    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public String array() {
        float[] array = {x,y};
        return Arrays.toString(array);
    }

    @Override
    public String toString() {
        return "Point: " +
                "x=" + x +
                ", y=" + y ;
    }
}
