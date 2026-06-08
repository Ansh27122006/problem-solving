package advanced.dsa.queue;

class ArrayQueue{
    int front;
    int rear;
    int capacity;
    int size;
    int[] arr;
    ArrayQueue(int n){
        arr=new int[n];
        capacity=n;
        front=-1;
        rear=-1;
        size=0;
    }
    boolean enqueue(int ele){
        if(isFull()){
            return false;
        }
        if(front==-1 && rear==-1){
            front++;
        }
        rear=(++rear)%capacity;
        arr[rear]=ele;
        size++;
        return true;
    }
    int dequeue(){
        if(isEmpty()){
            return -1;
        }
        size--;
        int value=arr[front];
        front=(front+1)%capacity;
        if(size==0){
            front=-1;rear=-1;
        }
        return value;
    }
    boolean isEmpty(){
        return size==0;
    }
    boolean isFull(){
        return capacity==size;
    }
    int size(){
        return size;
    }
    void display(){
        if(isEmpty()) return;
        int temp=0;
        while(temp<size()){
            System.out.print(arr[(temp+front)%capacity]+" ");
            temp++;
        }
        System.out.println();
    }
}
public class ArrayQueueMain {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
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
