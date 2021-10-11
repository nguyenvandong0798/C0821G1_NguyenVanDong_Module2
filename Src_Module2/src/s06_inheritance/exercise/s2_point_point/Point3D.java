package s06_inheritance.exercise.s2_point_point;

import java.util.Arrays;

public class Point3D extends Point2D{
    float z = 0.0f;

    public Point3D(){

    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.z =z;
        this.getX();
        this.getY();
    }

    public String getXYZ(){
        float arrays [] = {getX(),getY(),z};
        return Arrays.toString(arrays);
    }

    @Override
    public String toString() {
        return "Point3D : " +
                "x = " + getX() +
                ", y = " + getY() +
                ", z = " + z +
                ", arrays: " + getXYZ();
    }
}
