package adi.binarySearch;

import java.util.Arrays;

//given array with duplicate values find first and last occurrence of target
public class firstAndLastOccurence {
    static int[] search(int[] arr, int target){
        int[] ans = {-1,-1};

        //first occurence
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans[0]=mid;
                e=mid-1;
            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }

        //last occurence
        s=0; e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                ans[1]=mid;
                s=mid+1;
            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }

    static int countFrequency(int[] arr, int target){
        int[] ans=search(arr,target);
        if(ans[0]==-1) return -1;
        return ans[1]-ans[0]+1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3,4,5};
        System.out.println(Arrays.toString(search(arr,3)));
        System.out.println(countFrequency(arr,2));
    }
}
