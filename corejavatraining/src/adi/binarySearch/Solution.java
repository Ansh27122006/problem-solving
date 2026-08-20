package adi.binarySearch;

public class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max) max=piles[i];
        }
        if(piles.length==h) return max;

        int s=1, e=max;
        int ans=0;
        while(s<=e){
            int k=s+(e-s)/2;
            int calH=0;
            for(int pile:piles){
                    calH+=(int)Math.ceil((float)(pile)/k);
            }
            if(calH>h){
                s=k+1;
            }else{
                ans=k;
                e=k-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={3,6,7,11};
        int[] arr2={1000000000};
        System.out.println(minEatingSpeed(arr2,2));
    }
}
