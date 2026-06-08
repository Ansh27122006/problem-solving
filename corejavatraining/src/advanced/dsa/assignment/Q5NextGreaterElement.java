package advanced.dsa.assignment;

import java.util.Arrays;
import java.util.Stack;

public class Q5NextGreaterElement {
    static int[] nextGreater(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()) ans[i]=-1;
            else ans[i]=stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1={1,3,2,4};//output=[3, 4, 4, -1]
        System.out.println(Arrays.toString(nextGreater(arr1)));
        int[] arr2={6,8,0,1,3};//output=[8, -1, 1, 3, -1]
        System.out.println(Arrays.toString(nextGreater(arr2)));
    }
}
