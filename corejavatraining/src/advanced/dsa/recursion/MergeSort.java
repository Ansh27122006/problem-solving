package advanced.dsa.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static void mergeSort(int[] arr, int l, int r){
        if(l>=r) return;
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static void merge(int[] arr, int l, int mid, int r){
        int[] mer=new int[r-l+1];
        int i=l, j=mid+1, temp=0;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                mer[temp++]=arr[i++];
            }else{
                mer[temp++]=arr[j++];
            }
        }
        while(i<=mid){
            mer[temp++]=arr[i++];
        }
        while(j<=r){
            mer[temp++]=arr[j++];
        }
        temp=0;
        for(i=l;i<=r;i++){
            arr[i]=mer[temp++];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
