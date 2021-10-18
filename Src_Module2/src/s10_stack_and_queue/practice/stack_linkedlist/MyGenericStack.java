package s10_stack_and_queue.practice.stack_linkedlist;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack= new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new IllegalArgumentException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        if (stack.size() == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return stack.size();
    }
}
