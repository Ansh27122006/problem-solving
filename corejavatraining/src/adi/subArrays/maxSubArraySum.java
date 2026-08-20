package adi.subArrays;

public class maxSubArraySum {
    static int maxSum(int[] arr, int k){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
    //sliding window
    static int maxSum2(int[] arr, int k){
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        int sum=0;
        for(int i=0;i<k;i++) {
            sum += arr[i];
        }
        System.out.print(sum+" ");
        if(sum>max) max=sum;

//        int i=0, j=k;
//        while(j<n){
//            sum+=arr[j]-arr[i];
//            if(sum>max) max=sum;
//            System.out.print(sum+" ");
//            i++;
//            j++;
//        }
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            if(sum>max) max=sum;
            System.out.print(sum+" ");
        }
        System.out.println();
        return max;
    }
    public static void main(String[] args) {
        int[] arr ={2,1,5,1,3,2};//9
        System.out.println(maxSum2(arr,3));
    }
}
