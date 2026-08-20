package adi.twoPointer;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    static ArrayList<Integer> remove(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int j=0, lastE=-1;

        while(j<arr.length){
            if(arr[j]!=lastE){
                list.add(arr[j]);
                lastE=arr[j];
            }
            j++;
        }
        return list;
    }
    static int[] remove2(int[] arr){
        int i=0,j=1;

        while(j<arr.length){
            if(arr[i]!=arr[j]){
                arr[++i]=arr[j];
            }
            j++;
        }
        i++;
        while(i<arr.length){
            arr[i]=0;
            i++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,3,4};
        System.out.println(remove(arr));
        System.out.println(Arrays.toString(remove2(arr)));
    }
}
