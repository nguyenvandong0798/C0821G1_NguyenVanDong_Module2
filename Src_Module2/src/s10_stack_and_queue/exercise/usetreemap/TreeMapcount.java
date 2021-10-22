package s10_stack_and_queue.exercise.usetreemap;

import java.util.*;

public class TreeMapcount {
    public static void main(String[] args) {
        String string = "học lập trình java";
        string = string.toUpperCase();
        String[] myArray = string.split(" ");
        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < myArray.length; i++) {
            String key = myArray[i];
            if (myMap.containsKey(key)) {
                int currentValue = myMap.get(key);
                myMap.put(key, currentValue + 1);
            } else {
                myMap.put(key, 1);
            }
        }
        System.out.println(myMap);
    }
}
