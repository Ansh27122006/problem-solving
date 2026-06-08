package dsa.Recursion.Basic;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(-1234));
    }

    static int reverse(int n){
        if(n<0){
            return -reverse(-n);
        }
        return reverseHelper(n,0);
    }
    static int reverseHelper(int n, int rev){
        if(n==0){
            return rev;
        }
        return reverseHelper(n/10,(rev*10)+n%10);
    }
}
