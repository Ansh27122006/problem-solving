package edu.cu.training.java.basics.practice;

import java.util.Scanner;

public class Q1Factorial {
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            System.out.println("Factorial of"+t+": "+factorial(t));
        }
    }
}
