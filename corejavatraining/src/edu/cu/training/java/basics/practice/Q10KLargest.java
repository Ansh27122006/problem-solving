package edu.cu.training.java.basics.practice;

import java.util.Arrays;

public class Q10KLargest {
    static int kLargest(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length-1-k];
    }
    public static void main(String[] args) {
        int[] arr={8,5,6,3,9,10,64,2,1};
        System.out.println(kLargest(arr,1));
    }
}
