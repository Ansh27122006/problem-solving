package edu.cu.training.java.basics.practice;

public class Q6BinaryNumber {
    static int toBinary(int n){
        String s=Integer.toBinaryString(n);
        return Integer.parseInt(s);
    }
    static int toBinaryRecursive(int n){
        if(n==0 || n==1){
            return n;
        }
        return 10*toBinaryRecursive(n/2)+n%2;
    }
    public static void main(String[] args) {
        System.out.println(toBinaryRecursive(5));
    }
}
