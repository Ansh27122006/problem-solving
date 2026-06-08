package dsa.Recursion.Basic;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(1234567));
    }
    static int countDigits(int n){
        if(n<0){
            return countDigits(-n);
        }
        return countDigitsHelper(n,0);
    }
    static int countDigitsHelper(int n, int count){
        if(n==0){
            return count;
        }
        return countDigitsHelper(n/10,count+1);
    }
}

