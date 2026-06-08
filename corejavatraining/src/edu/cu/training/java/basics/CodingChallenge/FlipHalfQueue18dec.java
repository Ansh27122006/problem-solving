package edu.cu.training.java.basics.CodingChallenge;

import java.util.Queue;
import java.util.Stack;

public class FlipHalfQueue18dec {
    static void flip(Queue<Integer> q){
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<q.size();i++){
            int ele=q.remove();
            if(i%2!=0){
               stack.push(ele);
            }
            q.add(ele);
        }
        for(int i=0;i<q.size();i++){
            int ele=q.remove();
            if(i%2!=0){
                q.add(stack.pop());
            }else {
                q.add(ele);
            }
        }
    }
    public static void main(String[] args) {

    }
}
