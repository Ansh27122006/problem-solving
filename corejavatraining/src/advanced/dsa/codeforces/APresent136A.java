package advanced.dsa.codeforces;

import java.util.Arrays;

public class APresent136A {
    static int[] present(int n,int[] arr){
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[arr[i]-1]=i+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,1};
        System.out.println(Arrays.toString(present(4,arr)));
        int[] arr1={1,3,2};
        System.out.println(Arrays.toString(present(3,arr1)));
        int[] arr2={1,2};
        System.out.println(Arrays.toString(present(2,arr2)));
    }
}
