package edu.cu.training.java.basics.practice;

public class Q11MaxFrequency {
    static int maxFrequency(int[] arr){
        int ele=0;
        int freq=0;

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>freq || (count==freq && arr[i]<ele)){
                freq=count;
                ele=arr[i];
            }
        }
        return ele;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,3,2,4,2};
        System.out.println(maxFrequency(arr));
    }
}
