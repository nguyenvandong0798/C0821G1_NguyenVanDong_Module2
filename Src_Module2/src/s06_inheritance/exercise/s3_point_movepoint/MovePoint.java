package s06_inheritance.exercise.s3_point_movepoint;

import java.util.Arrays;

public class MovePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovePoint (){

    }

    public MovePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed= ySpeed;
    }

    public MovePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void Speed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String array(){
        float[] array = {xSpeed,ySpeed};
        return Arrays.toString(array);
    }

    public String move(){
        String move= "";
        float getMoveX = (getX() + getxSpeed());
        float getMoveY = (getY() + getxSpeed());
        move = "Return move point: " + "xs = " + getMoveX + ", ys = " + getMoveY;
        return move;
    }

    @Override
    public String toString() {
        return "MovePoint: " + "x = " + getX() + ", y = " + getY() + ", x speed = "
                + xSpeed + ", y speed = "
                + ySpeed ;
    }
}
