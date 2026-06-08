package edu.cu.training.java.basics.CodingChallenge;

import java.util.Scanner;

public class IceCreamTruck_ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=n-1;i>=0;i--){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
