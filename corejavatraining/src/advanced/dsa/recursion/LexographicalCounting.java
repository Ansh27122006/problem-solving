package advanced.dsa.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class LexographicalCounting {
    static void lc(int n){
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1+"";
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void recurse(int n, int current){
        if(current>n){
            return;
        }
        System.out.println(current);
        for(int i=0;i<=9;i++){
            recurse(n,current*10+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //lc(n);
        recurse(n,1);
    }
}
