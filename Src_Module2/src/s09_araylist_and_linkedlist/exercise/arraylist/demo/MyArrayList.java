package s09_araylist_and_linkedlist.exercise.arraylist.demo;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;

    private static final int DEFAULT_CAPACITY = 10;

    Object[] elements;

    public MyArrayList(Object[] elements) {
        this.elements = elements;
    }

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(int index, E element) {
        ensureCapacity();
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }

    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void ensureCapacity() {
        if (size >= elements.length) {
            int newSize = this.elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public E remove(int index) throws Exception {
        if (index < 0 || index > elements.length) {
            throw new Exception("Chi so index khong hop le.");
        }
        E element = (E) elements[index];

        /*vong lap xoa phan tu tai index*/
        for (int i = index; i < size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[size - 1] = null;
        size--;

        return element;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) { //equals so sanh ve mac ngu nghia, dung voi kieu object
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(0, 100);
        myArrayList.add(1, 200);
        myArrayList.add(2, 300);

//        for (int i = 0; i < myArrayList.size; i++) {
//            System.out.println(myArrayList.get(i));
//        }
//        System.out.println("-------");
        myArrayList.remove(1);
        for (int i = 0; i < myArrayList.size; i++) {
            System.out.println(myArrayList.get(i));
        }

//        System.out.println(myArrayList.indexOf(300));

//        System.out.println(myArrayList.get(0));//100
//        System.out.println(myArrayList.get(1));//300
//        System.out.println(myArrayList.get(2));//200
    }
}