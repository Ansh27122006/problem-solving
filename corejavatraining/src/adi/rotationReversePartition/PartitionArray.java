package adi.rotationReversePartition;

import java.util.Arrays;

public class PartitionArray {
    //elements greater than k at one side and less than at other side
    static void partition(int[] arr,int k){
        int n=arr.length;
        int i=0, j=n-1;
        while(i<j){
            if(arr[i]<=k) i++;
            if(arr[j]>k) j--;
            if(i<j && arr[i]>k && arr[j]<=k){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //even->left odd->right
    static void partitionEvenOdd(int[] arr){
        int n=arr.length;
        int i=0, j=n-1;
        while(i<j){
            if(arr[i]%2==0) i++;
            if(arr[j]%2!=0) j--;
            if(i<j && arr[i]%2!=0 && arr[j]%2==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void dnf(int[] arr, int lv, int hv){
        int low=0, mid=0, high=arr.length-1;
        while(mid<high){
            if(arr[mid]<=lv){
                swap(arr,low, mid);
                low++;
                mid++;
            }else if(arr[mid]>=lv && arr[mid]<=hv){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
//        int[] arr={4,6,2,8,9,1,5,3,7};
//        partition(arr,5);
//        int[] arr2={1,2,3,4,5,6,7,8,9};
//        partitionEvenOdd(arr2);
        int[] arr3={1,4,12,7,25,18,30};
        dnf(arr3,10,20);
    }
}
