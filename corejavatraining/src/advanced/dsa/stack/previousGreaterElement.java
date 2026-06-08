package advanced.dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class previousGreaterElement {
    static int[] previousGreater(int[] arr){
        int n=arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[i]>=stack.peek()){
                stack.pop();
            }
//            if(stack.isEmpty()){
//                ans[i]=-1;
//            }else{
//                ans[i]=stack.peek();
//            }
            ans[i]=(stack.isEmpty())?-1:stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={10,4,2,20,40,12};
        System.out.println(Arrays.toString(previousGreater(arr)));
        int[] arr1={10,20,30,40};
        System.out.println(Arrays.toString(previousGreater(arr1)));
    }
}
