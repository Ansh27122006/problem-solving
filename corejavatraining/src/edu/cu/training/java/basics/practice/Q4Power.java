package edu.cu.training.java.basics.practice;

public class Q4Power {
    static int power(int b, int p){
        if(p<0){
            return -1;
        }
        if(p==0){
            return 1;
        }
        if(p==1){
            return b;
        }
        if(b==0 || b==1){
            return b;
        }

        int halfPower=power(b,p/2);
        if(p%2==0){
            return halfPower*halfPower;
        }else{
            return halfPower*halfPower*b;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
}
