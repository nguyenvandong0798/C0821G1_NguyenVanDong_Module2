package s10_stack_and_queue.exercise.use_stack;

import s10_stack_and_queue.practice.stack_linkedlist.MyGenericStack;

import java.util.Scanner;
import java.util.Stack;

public class Ser {
    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("size của Stack: " + stack.size());
        System.out.printf("phương thức pop : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n kích thước ban đầu của Stacks : " + stack.size() + "\n");
    }
    public static void main(String[] args) {
        System.out.println("dạng số");
        stackOfIntegers();

//Phương thức chuổi

        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào chuổi: ");
        Stack <String> wStack = new Stack<>();
        String mWork = scanner.nextLine();
        for(int i = 0; i< mWork.length(); i++){
            wStack.push(mWork.charAt(i)+"");
        }
        for(int i = 0; i< mWork.length(); i++){
            System.out.print(wStack.pop());
        }
//        trả lại kích thước ban đàu của size
        System.out.println( "\n " + "kích thước ban đàu của wStack: " + wStack.size());
    }
}
