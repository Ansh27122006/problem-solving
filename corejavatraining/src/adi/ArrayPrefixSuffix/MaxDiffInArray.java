package adi.ArrayPrefixSuffix;

public class MaxDiffInArray {
    static int optimized(int[] arr){
        int prefixMin=arr[0];
        int maxDiff=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<prefixMin){
                prefixMin=arr[i];
            }
            maxDiff=Math.max(arr[i]-prefixMin,maxDiff);
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        int[] arr={2,3,10,6,4,8,1};
        System.out.println(optimized( arr));
    }
}
