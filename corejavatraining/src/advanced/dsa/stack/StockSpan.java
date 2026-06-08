package advanced.dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    static int[] findSpan(int n, int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()) ans[i]=1;
            else ans[i]=i-stack.peek();
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1={100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(findSpan(7,arr1)));
        int[] arr2={10,4,5,90,120,80};
        System.out.println(Arrays.toString(findSpan(6,arr2)));
    }
}
