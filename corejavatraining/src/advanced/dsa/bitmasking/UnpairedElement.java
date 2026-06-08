package advanced.dsa.bitmasking;

import java.util.Arrays;
import java.util.Scanner;

public class UnpairedElement {
    static int unpairedElement(int[] arr){
        int left=0, right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(right-left+1==3){
                if(arr[mid+1]==arr[mid]) return arr[mid-1];
                return arr[mid+1];
            }
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }else if(arr[mid]==arr[mid-1]){
                right=mid;
            }else{
                left=mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //int[] arr= {1,1,2,2,3,4,4,5,5};
        System.out.println(unpairedElement(arr));
    }
}
