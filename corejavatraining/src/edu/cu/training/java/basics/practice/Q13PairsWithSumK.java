package edu.cu.training.java.basics.practice;

public class Q13PairsWithSumK {
    static int pairs(int[] arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={12,15,20,22,34,36};
        System.out.println(pairs(arr,27));
    }
}
