package s011_map.practice.demo;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class demo {
    public static void main(String[] args) {
        Map<Integer,String> myTreeMap = new TreeMap<>();
        myTreeMap.put(1, "hoc lap trinh java");

        Set<Integer> strings = myTreeMap.keySet();

        for (Integer s : strings){
            System.out.println(myTreeMap.get(s));
        }
        Scanner scanner = new Scanner(System.in);
        String input = (scanner.nextLine());
        boolean check = false;
        int count = 0;
        for (int i = 0; i < myTreeMap.keySet().size(); i++){
            if (myTreeMap.keySet().equals(input)) {
                System.out.println(myTreeMap.get(i));
                check = true;
                count = count + 1;
                System.out.println(count);
                break;
            }
        }
        if (check == false){
            System.out.println("khong khop");
        }
    }
}
