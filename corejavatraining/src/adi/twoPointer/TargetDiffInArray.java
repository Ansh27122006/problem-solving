package adi.twoPointer;

public class TargetDiffInArray {
    static int[] diff(int[] arr, int target){
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[j]-arr[i]==target){
                return new int[]{i,j};
            }else if(arr[j]-arr[i]<target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {

    }
}
