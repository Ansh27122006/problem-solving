package adi.ArrayPrefixSuffix;

class RangeSum {
    static int[] prefix;
    RangeSum(int[] arr){
        int n=arr.length;
        prefix=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            prefix[i]=sum;
        }
    }
    static int rangeSum(int l, int r){
        if(l==0) return prefix[r];
        return prefix[r]-prefix[l-1];
    }
}
//class CountFr1 {
//    static int[] prefix;
//    CountFr1(int[] arr){
//        int n=arr.length;
//        prefix=new int[n];
//        int count=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==1) count++;
//            prefix[i]=count;
//        }
//    }
//    static int count1(int l, int r){
//        if(l==0) return prefix[r];
//        return prefix[r]-prefix[l-1];
//    }
//}
public class ArrayPrefixMain {
    static int equilibiriumIndex(int[] arr){
        int n = arr.length;
        int[] prefix= new int[n];
        int[] suffix = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            prefix[i]=sum;
        }
        sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=arr[i];
            suffix[i]=sum;
        }
        for(int i=1;i<n-1;i++){
            if(prefix[i-1]==suffix[i+1]) return i;
        }
        return -1;
    }
    static int equilibiriumIndexOp(int[] arr){
        int n = arr.length;
        int[] prefix= new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            prefix[i]=sum;
        }
        for(int i=1;i<n;i++){
            int rightSum=prefix[n-1]-prefix[i];
            if(prefix[i-1]==rightSum){
                return i;
            }
        }
        return -1;
    }

    static int equilibiriumIndexOp2(int[] arr){
        int n = arr.length;
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=arr[i];
        }
        int sum=0;
        for(int i=1;i<n;i++){
            sum+=arr[i-1];
            if(sum*2+arr[i]==totalsum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,8,3};
        RangeSum array = new RangeSum(arr);
        System.out.println(array.rangeSum(1,3));
        int[] arr2 = {1,0,1,1,0,1};
        RangeSum array2 = new RangeSum(arr2);
        System.out.println(array2.rangeSum(1,3));

        int[] arr3= {1,3,5,2,2};
        System.out.println(equilibiriumIndexOp2(arr3));
    }
}
