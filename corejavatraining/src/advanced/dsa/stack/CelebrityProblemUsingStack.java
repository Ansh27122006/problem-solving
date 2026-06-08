package advanced.dsa.stack;

import java.util.Stack;

public class CelebrityProblemUsingStack {
    //arr[i][j]=1 person i knows persons j
    //arr[i][j]=0 person i doesn't knows persons j
    //celebrity is a person who knows only themselves and is known by everyone
    static int celebrity(int[][] arr){
        int n=arr.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++) stack.push(i);
        while(stack.size()>1){
            int a=stack.pop();
            int b=stack.pop();
            if(arr[a][b]==1){
                stack.push(b);
            }else{
                stack.push(a);
            }
        }
        int c=stack.peek();
        for(int i=0;i<n;i++){
            if(i==c) continue;
            if(arr[c][i]==1 || arr[i][c]==0) return -1;
        }
        return c;
    }
    public static void main(String[] args) {
        int[][] arr1={{1,1,0},{0,1,0},{0,1,1}};
        System.out.println(celebrity(arr1));
        int[][] arr2={{1,1},{1,1}};
        System.out.println(celebrity(arr2));
    }
}
