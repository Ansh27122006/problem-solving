package edu.cu.training.java.basics.practice;

public class Q3PrimeFactors {
    static void primeFactor(int n){
        primeFactorHelper(n,2);
    }
    static void primeFactorHelper(int n, int f){
        if(n<=1){
            return;
        }
        if(n%f==0){
            System.out.println(f);
            primeFactorHelper(n/f,f);
        }else{
            primeFactorHelper(n,++f);
        }
    }
    public static void main(String[] args) {
        primeFactor(24);
    }
}
