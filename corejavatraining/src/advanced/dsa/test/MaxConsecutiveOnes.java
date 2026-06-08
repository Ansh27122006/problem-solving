package advanced.dsa.test;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxConsecutiveOnes {
    static int max(ArrayList<Integer> arr){
        int max=0, count=0;
        for(int e:arr){
            if(e==0){
                max=(count>max)?count:max;
                count=0;
            }else{
                count++;
            }
        }
        return (count>max)?count:max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(max(list));
    }
}
