package advanced.dsa.assignment;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q10ReverseFirstKElementsInQueue {
    static Queue<Integer> reverseK(Queue<Integer> q, int k){
        if(k>q.size()) return q;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }
        for(int i=0;i< q.size()-k;i++){
            q.offer(q.poll());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(reverseK(q1,3));
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(4,3,2,1));
        System.out.println(reverseK(q2,4));
    }
}
