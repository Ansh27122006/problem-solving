package adi.subArrays;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstNegativeInteger {
    static void firstNegativeInWindow(int[] arr, int k){
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            q.add(arr[i]);
        }
        boolean found = false;
        for(int e:q){
            if(e<0){
                System.out.print(e+" ");
                found=true;
                break;
            };
        }
        if(!found) System.out.print("0 ");
        for(int i=k;i<arr.length;i++){
            q.poll();
            q.add(arr[i]);
            found = false;
            for(int e:q){
                if(e<0){
                    System.out.print(e+" ");
                    found=true;
                    break;
                };
            }
            if(!found) System.out.print("0 ");
        }
    }static void firstNegativeInWindowII(int[] arr, int k){
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                q.add(i);
            }
            if(!q.isEmpty() && q.peek()<=i-k){
                q.poll();
            }
            if(i>=k-1){
                if(q.isEmpty()){
                    System.out.print("0 ");
                }else{
                    System.out.print(arr[q.peek()]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={-8,2,3,-6,10};
        firstNegativeInWindowII(arr,2);
    }
}
