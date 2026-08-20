package adi.rotationReversePartition;

import java.util.Arrays;

public class QuickSort {
    static int partition(int[] arr, int l, int r){
        int i=l-1, j=r-1;
        while(i<j){
            if(arr[j]<arr[r]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }else{
                j--;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[r];
        arr[r]=temp;
        return i;
    }
    static void quickSort(int[] arr, int i, int j){
        if(i>=j) return;
        int p = partition(arr, i,j);
        quickSort(arr,i,p-1);
        quickSort(arr,p+1,j);
    }
    static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={4,6,2,8,9,1,5,3,7};
        quickSort(arr);
    }
}
