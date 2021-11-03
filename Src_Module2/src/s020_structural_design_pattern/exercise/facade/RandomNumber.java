package s020_structural_design_pattern.exercise.facade;

public class RandomNumber {
    public int generateInteger(int min, int max){
        double randomDouble = Math.random();
        int randomInteger =  (int) (randomDouble * (max - min + 1) + min);
        return randomInteger;
    }
}
