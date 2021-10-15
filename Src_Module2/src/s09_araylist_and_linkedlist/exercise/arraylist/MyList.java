package s09_araylist_and_linkedlist.exercise.arraylist;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];

    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IndexOutOfBoundsException("capacity: " + capacity);
        }
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean isAdd(E element) {
        if (elements.length == size){
            this.ensureCapacity(5);
        }
            elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, minCapacity);
        } else {
            throw new IllegalArgumentException("mincapacity: " + minCapacity);
        }
    }

    public void add(int index, E element){
        if (index > elements.length){
            throw new IllegalArgumentException("index: " + index);
        }else if (elements.length == size){
            this.ensureCapacity(5);
            size++;
        }
        if ( elements[index]==null){
            elements[index] = element;
            size++;
        } else
            for (int i = size + 1; i>=index; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
    }
}
