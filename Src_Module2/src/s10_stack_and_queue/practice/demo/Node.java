package s10_stack_and_queue.practice.demo;

public class Node {
    public Node next;
    private int data;

    public Node(int data){
        this.data =data;
        this.next = null;
    }
    public void printData(){
        System.out.print("data: " + this.data + "\n");
    }
}
