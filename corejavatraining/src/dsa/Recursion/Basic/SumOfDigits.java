package dsa.Recursion.Basic;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(-123));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -sum(-n);
        }
        return n%10+sum(n/10);
    }
}
