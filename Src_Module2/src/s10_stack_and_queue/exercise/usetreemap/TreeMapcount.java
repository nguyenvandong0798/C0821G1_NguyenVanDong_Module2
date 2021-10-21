package s10_stack_and_queue.exercise.usetreemap;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapcount {
    public static void main(String[] args) {
        String string = "học lập trình java";
        string = string.toUpperCase();
        System.out.println(string);

        int count = 0;
        Map<Character, Integer> countWord = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào từ cần kiểm tra");
        char word = scanner.nextLine().charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == word) {
                System.out.println(word);
                count = count + 1;
                System.out.println(count);
                break;
            }
        }
        Set<Character> characters = countWord.keySet();
        for (Character chars:characters){
            System.out.println(countWord.get(chars));
        }

//        Nếu từ đó có trong Sting thì tăng thêm 1 giá trị.
        for (int i= 0; i<string.length();i++){
            if (word == string.charAt(i)){
                count = count + 1;
                System.out.println(count);
            }
        }
    }
}
