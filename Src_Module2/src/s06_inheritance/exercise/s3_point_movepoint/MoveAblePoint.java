package s06_inheritance.exercise.s3_point_movepoint;

import java.util.Arrays;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint(){

    }

    public MoveAblePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed= ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }


    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void Speed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] array = {xSpeed,ySpeed};
        return array;
    }

    public MoveAblePoint move(){
        super.setX(super.getX() + this.getXSpeed());
        super.setY(super.getY() + this.getYSpeed());
        return this;
    }

    @Override
    public String toString() {
        return Arrays.toString(super.getXY())+ Arrays.toString(this.getSpeed());
    }

}
