package advanced.dsa.bitmasking;

import java.util.Arrays;
import java.util.Scanner;

public class UnpairedElement2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int unpaired=0;
        for(int i=0;i<32;i++){
            int sum=0;
            for(int ele:arr){
                if((ele & (1<<i))!=0){
                    sum++;
                }
            }
            if(sum%3!=0){
                unpaired =unpaired | (1<<i);
            }
        }
        System.out.println(unpaired);
    }
}
