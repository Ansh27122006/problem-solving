package advanced.dsa.assignment;

import java.util.Arrays;
import java.util.Stack;

public class Q6LargestRectangleInHistogram {
    public static int largestRectangleArea(int[] heights) {
        int[] ps=previousSmallerIndex(heights);
        int[] ns=nextSmallerIndex(heights);
        int max=0;
        for(int i=0;i<heights.length;i++){
            int area=(ns[i]-ps[i]-1)*heights[i];
            max=Math.max(area,max);
        }
        return max;
    }
    static int[] previousSmallerIndex(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int[] ans= new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()) ans[i]=-1;
            else ans[i]=stack.peek();
            stack.push(i);
        }
        return ans;
    }
    static int[] nextSmallerIndex(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int[] ans= new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()) ans[i]=heights.length;
            else ans[i]=stack.peek();
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1={60, 20, 50, 40, 10, 50, 60};
        System.out.println(largestRectangleArea(arr1));//100
        int[] arr2 ={3, 5, 1, 7, 5, 9};
        System.out.println(largestRectangleArea(arr2));//15
        int[] arr3 ={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr3));//10
        int[] arr4 ={2,4};
        System.out.println(largestRectangleArea(arr4));//4
    }
}
