package advanced.dsa.queue;

class LLQueue{
    Node front;
    Node rear;
    int size;
    int capacity;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    LLQueue(){
        size=0;
        capacity=-1;
    }
    LLQueue(int capacity){
        this.capacity=capacity;
    }
    boolean enqueue(int ele){
        if(isFull()) return false;
        Node newNode=new Node(ele);
        if(front==null && rear==null){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
        size++;
        return true;
    }
    int dequeue(){
        if(isEmpty()) return -1;
        int value=front.data;
        front=front.next;
        size--;
        return value;
    }
    boolean isEmpty(){
        return size==0;
    }
    boolean isFull(){
        return size==capacity;
    }
    int size(){
        return size;
    }
    void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class LLQueueMain {
    public static void main(String[] args) {
        LLQueue queue = new LLQueue();
        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        queue.enqueue(7);
        queue.enqueue(9);
        queue.display();
    }
}
