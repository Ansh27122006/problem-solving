package advanced.dsa.codeforces;

import java.util.Stack;

public class PoliceRecruits427A {
    static int untreatedCrimes(int n, int[] arr){
        int count=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(arr[i]==-1){
                if(stack.isEmpty()){
                    count++;
                }else if(stack.peek()==1){
                    stack.pop();
                }else{
                    stack.push(stack.pop()-1);
                }
            }else{
                stack.push(arr[i]);
            }
        }
        return count;
    }
    static int untreatedCrimes2(int n, int[] arr){
        int crimes=0;
        int hires=0;
        for(int i=0;i<n;i++){
            if(arr[i]==-1){
                if(hires==0){
                    crimes++;
                }else{
                    hires--;
                }
            }else{
                hires+=arr[i];
            }
        }
        return crimes;
    }
    public static void main(String[] args) {
        int[] arr={-1,-1,1};
        System.out.println(untreatedCrimes2(3,arr));

        int[] arr1={1,-1,1,-1,-1,1,1,1};
        System.out.println(untreatedCrimes2(8,arr1));

        int[] arr2={-1,-1,2,-1,-1,-1,-1,-1,-1,-1,-1};
        System.out.println(untreatedCrimes2(11,arr2));
    }
}
