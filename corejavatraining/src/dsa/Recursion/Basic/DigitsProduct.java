package dsa.Recursion.Basic;

public class DigitsProduct {
    public static void main(String[] args) {
        System.out.println(product(-1234));
    }
    static int product(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return -product(-n);
        }
        return n%10*product(n/10);
    }
}
