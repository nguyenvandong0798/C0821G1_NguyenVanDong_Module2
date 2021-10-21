package s10_stack_and_queue.practice.demo;

import s10_stack_and_queue.practice.demo.NhapQueue;
import s10_stack_and_queue.practice.demo.Node;

public class Main {
    public static void main(String[] args) {
        NhapQueue queue = new NhapQueue();

        queue.enQueue(new Node(100));
        queue.enQueue(new Node(200));
        queue.enQueue(new Node(300));

        System.out.print("\n");
        queue.print();
        Node node = queue.deQueue();
        if (node !=null){
            System.out.println("de queue");
            node.printData();
        }
    }
}
