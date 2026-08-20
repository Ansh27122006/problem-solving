package adi.twoPointer;
import java.util.Arrays;

//sorted array is given
//find two numbers whose sum is equal to target
//there is exactly one solution

public class TargetSumInArray {
    static int[] sum(int[] arr, int target){
        int[] ans={-1,-1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i!=j && arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    static int[] sumII(int[] arr, int target){
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                return new int[]{i,j};
            }else if(arr[i]+arr[j]<target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        System.out.println(Arrays.toString(sumII(arr,18)));
    }
}
