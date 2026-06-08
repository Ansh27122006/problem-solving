package advanced.dsa.assignment;

import java.util.Stack;

public class Q7QueueUsingStack {
    static class Queue{
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        void enqueue(int ele){
            stack1.push(ele);
        }
        int dequeue(){
            if(isEmpty()) return -1;
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            int pop=stack2.pop();
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return pop;
        }
        boolean isEmpty(){
            return stack1.isEmpty();
        }
        int size(){
            return stack1.size();
        }
        void display(){
            System.out.println(stack1);
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
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
