package dsa.Recursion.SortingSearching;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr,int i,int n){
        if(n==0){
            return;
        }else if(i==arr.length-1){
            bubbleSort(arr,0,n-1);
        }else{
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            bubbleSort(arr,i+1,n);
        }
    }
    public static void main(String[] args) {
        int[] arr={3,7,1,4,5};
        bubbleSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
