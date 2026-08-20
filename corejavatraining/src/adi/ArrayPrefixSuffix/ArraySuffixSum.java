package adi.ArrayPrefixSuffix;

class RangeSumSuffix{
    static int[] suffix;
    RangeSumSuffix(int[] arr){
        int n=arr.length;
        suffix=new int[n];
        int sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=arr[i];
            suffix[i]=sum;
        }
    }
    static int rangeSum(int l, int r){
        if(l==0) return suffix[0];
        return suffix[l]-suffix[r+1];
    }
}
public class ArraySuffixSum {
    public static void main(String[] args) {
        int[] arr={5,2,7,1,3};
        RangeSumSuffix array = new RangeSumSuffix(arr);
        System.out.println(array.rangeSum(1,3));
    }
}
