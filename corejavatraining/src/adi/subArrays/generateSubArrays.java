package adi.subArrays;

import java.util.ArrayDeque;
import java.util.Queue;

public class generateSubArrays {
    static void generateSubArrays(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    static void generateIntervalOf3(int[] arr){
        int j=0, k=3;
        while(k<=arr.length){
            for(int i=j;i<k;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            j++;k++;
        }
    }
    static void generateIntervalOf3II(int[] arr,int k){
        for(int i=0;i<arr.length-k+1;i++){
            for(int j=i;j<i+k;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
    //using queue
    static void generateIntervalOf3III(int[] arr,int k){
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            q.add(arr[i]);
        }
        System.out.println(q);
        for(int i=k;i<arr.length;i++){
            q.poll();
            q.add(arr[i]);
            System.out.println(q);
        }
    }
    //using queue
    static void generateIntervalOf3IV(int[] arr,int k){
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
            if(q.size()==k){
                System.out.println(q);
                q.poll();
            }
        }
    }
    //using queue but store index instead of elements
    static void generateIntervalOf3V(int[] arr,int k){
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            q.add(i);
        }
        for(int e:q){
            System.out.print(arr[e]+" ");
        }
        System.out.println();

        for(int i=k;i<arr.length;i++){
            q.poll();
            q.add(i);
            for(int e:q){
                System.out.print(arr[e]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        int[] arr={1,2,3};
//        generateSubArrays(arr);
        int[] arr2={1,2,3,4,5,6,7};
        generateIntervalOf3IV(arr2,4);

        int[] arr3={10,20,30,40,50,60};
        generateIntervalOf3V(arr3,3);
    }
}
