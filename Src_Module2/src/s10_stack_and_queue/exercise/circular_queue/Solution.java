package s10_stack_and_queue.exercise.circular_queue;

public class Solution {
    static class Node{
        int data;
        Node link;
    }
    static class Queue{
        Node front, rear;
    }

//    chức năng thêm phần tử cho vòhg queue
    static void enQueue(Queue q, int value){
        Node temp = new Node();
        temp.data = value;
        if (q.front == null){
            q.front = temp;
        }else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }

//    chức năng xoá phần tử
    static int deQueue(Queue q){
        if (q.front == null){
            System.out.println("empty");
            return Integer. MIN_VALUE;
        }
    int value;
        if (q.front==q.rear){
            value =q.front.data;
            q.front=null;
            q.rear=null;
        }else{
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.rear;
        }
        return value;
    }

//    chức năng hiển thị phần tử
    static void display(Queue q){
        Node temp = q.front;
        System.out.println("\n" + "các phần tử trong vòng queue: ");
        while (temp.link != q.front){
            System.out.printf("%d", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }


    public static void main(String args[])
    {
        // Tạo một hàng đợi và khởi tạo phía trước và phía sau
        Queue  q = new Queue();
        q .front = q .rear =  null;

        // Chèn các phần tử trong vomg queue
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        // Hiển thị các phần tử có trong vomg queue
        display(q);

        // Xóa các phần tử khỏi vòng queue
        System.out.printf(" Deleted value = %d", deQueue(q));
        System.out.printf(" Deleted value = %d", deQueue(q));

        // Các phần tử còn lại trong vòng queue
        display(q);

        enQueue(q, 9);
        enQueue(q, 20);
        display(q);

    }
}
