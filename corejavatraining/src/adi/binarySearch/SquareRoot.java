package adi.binarySearch;

public class SquareRoot {
    static int sq(int n){
        int i=1;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }
    static int sqB(int n){
        int s=1,e=n/2;
        int ans=0;
       while(s<=e){
           int mid=s+(e-s)/2;
           if(mid*mid<=n){
               ans=mid;
               s=mid+1;
           }else{
               e=mid-1;
           }
       }
       return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqB(10));
    }
}
