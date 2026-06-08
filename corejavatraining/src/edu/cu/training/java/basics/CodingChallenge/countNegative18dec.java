package edu.cu.training.java.basics.CodingChallenge;

public class countNegative18dec {
    static int count(int[] arr, int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(count(arr,5));
    }
}
