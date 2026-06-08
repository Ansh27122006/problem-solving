package edu.cu.training.java.basics.practice;

public class Q5FormNewNumber {
    static int evenDigits(int n){
        return evenDigits(n,1);
    }static int evenDigits(int n, int count){
        if(n==0){
            return 0;
        }
        int last=n%10;
        if(last%2==0){
            return evenDigits(n/10,count*10)+(last*count);
        }else {
            return evenDigits(n/10,count);
        }
    }
    public static void main(String[] args) {
        System.out.println(evenDigits(35179));
    }
}
