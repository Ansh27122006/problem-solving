package adi.twoPointer;

import java.util.ArrayList;

public class SquareOfSortedArray {
    static ArrayList<Integer> sortedSquare(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        for(i=0;i<arr.length-1;i++){
            if(arr[i]<0 && arr[i+1]>=0) break;
        }
        int j=i+1;
        while(i>=0 && j<arr.length){
            if(arr[i]*-1<arr[j]){
                list.add(arr[i]*arr[i]);
                i--;
            }else{
                list.add(arr[j]*arr[j]);
                j++;
            }
        }
        while(i>=0){
            list.add(arr[i]*arr[i]);
            i--;
        }
        while(j<arr.length){
            list.add(arr[j]*arr[j]);
            j++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={-7,-3,2,3,11};
        System.out.println(sortedSquare(arr));
    }
}
