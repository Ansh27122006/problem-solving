package advanced.dsa.bitmasking;

import java.util.Arrays;
import java.util.Scanner;

public class  TwoUnpairedElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int xor=0;
        for(int ele:arr){
            xor=xor^ele;
        }
        int mask=xor & -xor;
        int unpair1=0, unpair2=0;
        for(int ele:arr){
            if((ele & mask)==0){
                unpair1^=ele;
            }else{
                unpair2^=ele;
            }
        }
        System.out.println(unpair1+" "+unpair2);
    }
}
