package adi.rotationReversePartition;

import java.util.Arrays;

public class ReverseArray {
    static void reverse(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void reverse2(int[] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverse2(arr);
    }
}
