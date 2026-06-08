package edu.cu.training.java.basics.CodingChallenge;

public class OddEvenCount18dec {
    static void count(int[] arr, int n){
        int odd=0, even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0) even++;
            else odd++;
        }
        System.out.println(even+" "+odd);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        count(arr,5);
    }
}