package advanced.dsa.assignment;

public class Q11MaximumSubarraySum {
    static int maxSASum(int[] arr){
        int res =arr[0];
        int maxEnding=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1={-2,1,-3,4,-1,2,1,-5,4};//6
        System.out.println(maxSASum(arr1));
        int[] arr2={1};//1
        System.out.println(maxSASum(arr2));
        int[] arr3={5,4,-1,7,8};//23
        System.out.println(maxSASum(arr3));
        int[] arr4={2, 3, -8, 7, -1, 2, 3};//11
        System.out.println(maxSASum(arr4));
        int[] arr5={-2, -4};//-2
        System.out.println(maxSASum(arr5));
        int[] arr6={5, 4, 1, 7, 8};//25
        System.out.println(maxSASum(arr6));
    }
}
