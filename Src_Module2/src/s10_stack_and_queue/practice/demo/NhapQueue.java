package s10_stack_and_queue.practice.demo;

import s10_stack_and_queue.practice.demo.Node;

import java.util.Queue;

public class NhapQueue {
    private Node head;
    private Node tail;
    private int size;

  public NhapQueue(){
      this.size = 0;
      this.head = null;
      this.tail =null;
  }
  public void enQueue(Node node){
      if (this.isEmpty()){
          this.head = node;
          this.tail = node;
          this.size++;
          return;
      }
      this.tail.next = node;
      this.tail = node;
      this.size++;

  }
  public Node deQueue(){
      if (isEmpty()){
          System.out.println("rong");
          return null;
      }
      Node node = this.head;
      this.head = this.head.next;
      this.size--;
      return node;
  }
    public boolean isEmpty(){
        return (this.size==0);
    }

    public void print(){
        Node node = this.head;
        while (node != null){
            node.printData();
            node = node.next;
        }
    }
}
