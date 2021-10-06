package s04_class_and_object.exercise;

import javax.xml.crypto.Data;

import java.util.Arrays;
import java.util.Date;

public class ClassFan {
    private Date startTime;
    private Date endTime;

    public ClassFan() {
        this.startTime = new Date();
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime  = new Date();
    }

    public float getElapsedTime(){
        return this.endTime.getTime() - this.startTime.getTime();
    }

    public static void main(String[] args) {
        ClassFan stopWatch = new ClassFan();

        stopWatch.start();

        double[] arr1 = new double[50000];
        for(int i= 0; i<50000; i++){
            arr1[i] = Math.random()*100 + 1;
        }
        System.out.println(Arrays.toString(arr1));
        stopWatch.stop();
        System.out.printf("Elapsed time: %.2f ms", stopWatch.getElapsedTime());}
}
