package edu.cu.training.java.basics.CodingChallenge;

import java.util.Arrays;

public class ForestResearch {
    static void research(int[] arr){
        Arrays.sort(arr);
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                if(count%2!=0){
                    System.out.print(arr[i-1]+" ");
                }
                count=1;
            }else{
                count++;
            }
        }
        if(count%2!=0){
            System.out.print(arr[arr.length-1]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,2,2,3,1,1,4,4,1,1};
        research(arr);
    }
}
