package edu.cu.training.java.basics.CodingChallenge;

public class rewardPoints18dec {
    static int points(int n){
        String s=n+"";
        int count=0;
        int[] arr = {1,0,0,0,1,0,1,0,2,1};
        for(char ch:s.toCharArray()){
            int digit=ch-'0';
            count+=arr[digit];
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(points(678));
    }
}
