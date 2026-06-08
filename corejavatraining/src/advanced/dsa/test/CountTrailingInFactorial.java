package advanced.dsa.test;


public class CountTrailingInFactorial {
    static int countTrailing(int n){
        int count=0;
        while(n>=5){
            count+=n/5;
            n=n/5;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countTrailing(20));
    }
}
