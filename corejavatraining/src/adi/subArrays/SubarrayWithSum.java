package adi.subArrays;

public class SubarrayWithSum {
    static int smallestSubArray(int[] arr, int target){
        int n=arr.length;
        int s=0,e=0;
        int sum=arr[0];
        int minL=Integer.MAX_VALUE;
        while(e<n && s<=e){
            if(sum<target){
                e++;
                if(e>=n) break;
                sum+=arr[e];
            }else{
                if(e-s+1<minL){
                    minL=e-s+1;
                }
                sum-=arr[s];
                s++;
            }
        }
        if(minL==Integer.MAX_VALUE) return -1;
        return minL;
    }
    static int smallestSubArray2(int[] arr, int target){
        int n=arr.length;
        int s=0,e=0;
        int sum=0;
        int minL=Integer.MAX_VALUE;
        while(e<n && s<=e){
            sum+=arr[e];
            while(sum>=target){
                if(minL>e-s+1){
                    minL=e-s+1;
                }
                sum-=arr[s];
                s++;
            }
            e++;
        }
        if(minL==Integer.MAX_VALUE) return -1;
        return minL;
    }
    static int longestSubArray(int[] arr, int target){
        int n=arr.length;
        int s=0,e=0;
        int sum=0;
        int maxL=0;
        while(e<n && s<=e){
            sum+=arr[e];
            while(sum>target){
                sum-=arr[s];
                s++;
                if(s==n) break;
            }
            if(maxL<e-s+1){
                maxL=e-s+1;
            }
            e++;
        }
        if(maxL==0) return -1;
        return maxL;
    }
    //count subarrays sum<k
    static int countSubarrays(int[] arr, int k) {
        int s = 0;
        int sum = 0;
        int count = 0;

        for (int e = 0; e < arr.length; e++) {
            sum += arr[e];

            while (sum >= k) {
                sum -= arr[s++];
            }

            // Number of valid subarrays ending at e
            count += (e - s + 1);
        }

        return count;
    }
    public static void main(String[] args) {
//        int[] arr={2,1,10,2,3,2};
//        System.out.println(longestSubArray(arr,7));
//        int[] arr2={1,1,1,1,1,1,1,7};
//        System.out.println(smallestSubArray2(arr2,7));
        int[] arr3={1,2,3};
        System.out.println(countSubarrays(arr3,3));
        int[] arr4={1,1,1};
        System.out.println(countSubarrays(arr4,3));
    }
}
