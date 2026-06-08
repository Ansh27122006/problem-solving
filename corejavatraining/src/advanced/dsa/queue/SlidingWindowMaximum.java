package advanced.dsa.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//-----------------------------------------Not correct
public class SlidingWindowMaximum{
    static ArrayList<Integer> slidingWindowMaximum(int[] arr, int k){
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            while(!q.isEmpty() && q.peek()<arr[i]){
                q.poll();
            }
            q.offer(arr[i]);
        }
        list.add(q.peek());
        for(int i=k;i<arr.length;i++){
            while(!q.isEmpty() && q.peek()<arr[i]){
                q.poll();
            }
            q.offer(arr[i]);
            list.add(q.peek());
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr1={1,3,-1,-3,5,3,6,7};
        System.out.println(slidingWindowMaximum(arr1,3));
    }
}
