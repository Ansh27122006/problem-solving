package edu.cu.training.java.basics.practice;

public class Q2SumOfDigits {
    static int sum(int n){
        if(n<0){
            return -sum(-n);
        }
        if(n<=9){
            return n;
        }
        return n%10+sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(-1729));
    }
}
