package edu.cu.training.java.basics.CodingChallenge;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
    static String reverse(String str){
        Stack<Character> stack = new Stack<>();

        for(char ch:str.toCharArray()){
            stack.push(ch);
        }

        StringBuilder s=new StringBuilder();

        while(!stack.isEmpty()){
            s.append(stack.pop());
        }
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(reverse(str));
    }
}
