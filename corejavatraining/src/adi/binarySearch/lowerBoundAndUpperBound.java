package adi.binarySearch;

//Lower Bound: The smallest index where the element value is greater than or equal to (≥) the target value.
// Upper Bound: The smallest index where the element value is strictly greater than (>) the target value.

public class lowerBoundAndUpperBound {
    static int lowerBound(int[] arr, int target){
        int n=arr.length;
        if(target>arr[n-1]) return n;

        int s=0, e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
    static int upperBound(int[] arr, int target){
        int n=arr.length;
        if(target>arr[n-1]) return n;

        int s=0, e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,4,7};
        System.out.println(upperBound(arr,10));
    }
}
