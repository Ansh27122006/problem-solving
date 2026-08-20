package adi.rotationReversePartition;

import java.util.Arrays;

public class RotateArray {
    static void rotatePrintLeft(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[0]);
    }
    static void rotatePrintRight(int[] arr){
        int n=arr.length;
        System.out.print(arr[n-1]+" ");
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void rotateLeft1(int[] arr){
        int n=arr.length;
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
    static void rotateRight1(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
    static void rotateLeftK(int[] arr,int k){
        int n=arr.length;
        for(int j=0;j<k;j++){
            int temp=arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void rotateRightK(int[] arr,int k){
        for(int j=0;j<k;j++){
            int n=arr.length;
            int temp=arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void reversalAlgoLeft(int[] arr,int k){
        int n=arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reversalAlgoRight(int[] arr,int k){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr,int l,int r){
        int i=l, j=r;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reversalAlgoLeft(arr,2);
        int arr2[]={1,2,3,4,5,6};
        reversalAlgoRight(arr2,2);
    }
}
