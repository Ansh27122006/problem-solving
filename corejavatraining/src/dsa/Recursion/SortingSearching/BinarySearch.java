package dsa.Recursion.SortingSearching;

public class BinarySearch {
    static int binarySearch(int[] arr,int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            return binarySearch(arr,target,mid+1,end);
        }
        return binarySearch(arr,target,start,mid-1);
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,7,8,9};
        System.out.println(binarySearch(arr,8,0,arr.length-1));
    }
}
