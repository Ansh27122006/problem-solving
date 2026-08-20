package adi.ArrayPrefixSuffix;

public class RainWaterTrapping {
    static int trap(int[] arr){
        int n=arr.length;
        if(n==0) return 0;

        int[] prevMax=new int[n];
        int pMax=arr[0];
        for(int i=0;i<n;i++){
            if(pMax<arr[i]){
                pMax=arr[i];
            }
            prevMax[i]=pMax;
        }

        int[] nextMax=new int[n];
        int nMax=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(nMax<arr[i]){
                nMax=arr[i];
            }
            nextMax[i]=nMax;
        }

        int trapWater=0;
        for(int i=0;i<n;i++){
            trapWater+=Math.min(prevMax[i],nextMax[i])-arr[i];
        }
        return trapWater;
    }
    public static void main(String[] args) {
        int[] arr1={3,0,2,0,4};
        System.out.println(trap(arr1));
        int[] arr2={4,2,0,3,2,5};
        System.out.println(trap(arr2));
        int[] arr3={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr3));
    }
}
