package advanced.dsa.heap;

import java.util.PriorityQueue;

public class KthLargestFactor {
    static int kthLargest(int n, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                minHeap.offer(i);
                if(minHeap.size()>k){
                    minHeap.poll();
                }
            }
        }
        return minHeap.poll();
    }
    static int kthLargest2(int n, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                minHeap.offer(i);
                if(minHeap.size()>k){
                    minHeap.poll();
                }
            }
            if(i!=n/i){
                minHeap.offer(n/i);
                if(minHeap.size()>k){
                    minHeap.poll();
                }
            }
        }
        return minHeap.poll();
    }
    public static void main(String[] args) {
        System.out.println(kthLargest2(12,3));
        System.out.println(kthLargest(30,9));
    }
}
