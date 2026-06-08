package advanced.dsa.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class MaxStolenValue {
    static int maxTheft(int[] arr, int result, int i){
        if(i<0){
            return result;
        };
        int include=maxTheft(arr,result+arr[i],i-2);
        int exclude=maxTheft(arr,result,i-1);
        return Integer.max(include,exclude);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(maxTheft(arr,0,arr.length-1));
    }
}
