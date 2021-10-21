package s10_stack_and_queue.exercise.use_stack;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {

        Stack<Integer> stacks = new Stack<>();
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            stacks.push(array[i]);
        }
        System.out.println("mảng ban đầu" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = stacks.pop();
        }
        System.out.println("đảo mảng" + Arrays.toString(array));


//Phương thức chuổi


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chuổi: ");
        Stack<String> wStack = new Stack<>();
        String mWork = scanner.nextLine();
        for (int i = 0; i < mWork.length(); i++) {
            wStack.push(mWork.charAt(i) + "");
        }
        for (int i = 0; i < mWork.length(); i++) {
            System.out.print(wStack.pop());
        }
//        trả lại kích thước ban đàu của size
        System.out.println("\n " + "kích thước ban đàu của wStack: " + wStack.size());
    }
}

