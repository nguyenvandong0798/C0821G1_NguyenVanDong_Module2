package s10_stack_and_queue.exercise.use_stack;

import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> stack;

    MyStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        return stack.removeFirst();
    }

    boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return stack.size();
    }
}

