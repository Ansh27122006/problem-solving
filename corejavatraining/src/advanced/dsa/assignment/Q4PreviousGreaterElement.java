package advanced.dsa.assignment;

import java.util.Arrays;
import java.util.Stack;

public class Q4PreviousGreaterElement {
    static int[] previousGreater(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
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
        int[] arr1={10, 4, 2, 20, 40, 12};//output=[-1, 10, 4, -1, -1, 40]
        System.out.println(Arrays.toString(previousGreater(arr1)));
        int[] arr2={10, 20, 30, 40};//output= [-1, -1, -1, -1]
        System.out.println(Arrays.toString(previousGreater(arr2)));
    }
}
