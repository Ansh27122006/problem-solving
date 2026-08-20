package adi.binarySearch;

public class RotatedSortedArray {
    static int find(int[] arr, int target){
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target) return mid;
            //left half is sorted
            else if(arr[mid]>arr[s]){
                if(arr[s]>target){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }
            //right half is sorted
            else{
                if(target<arr[mid]){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1={4,5,6,0,1,2};
        System.out.println(find(arr1,0));
        int[] arr2={4,5,6,7,8,0,1,2};
        System.out.println(find(arr2,0));
        int[] arr3={7,8,0,1,2,3,4,5,6};
        System.out.println(find(arr3,8));
    }
}
