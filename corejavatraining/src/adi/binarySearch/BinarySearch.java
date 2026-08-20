package adi.binarySearch;

public class BinarySearch {
    static int search(int[] arr, int target){
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid=s+((e-s)/2);
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }

    static int searchR(int[] arr, int target){
        return searchR(arr, target, 0, arr.length-1);
    }
    static int searchR(int[] arr, int target, int s, int e){
        if(s>e) return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return searchR(arr, target, s, mid-1);
        return searchR(arr, target, mid+1, e);
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12,14};
        System.out.println(search(arr,12));
        System.out.println(searchR(arr,12));
    }


}
