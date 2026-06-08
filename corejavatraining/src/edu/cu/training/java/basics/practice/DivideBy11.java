package edu.cu.training.java.basics.practice;

public class DivideBy11 {
    static boolean divide(long n){
        String s=n+"";

        int evenSum=0, oddSum=0;
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'0';

            if(i%2==0){
                evenSum+=ch;
            }else{
                oddSum+=ch;
            }
        }

        if((evenSum-oddSum)%11==0){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(divide(98912));
    }
}
