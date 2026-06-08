package dsa.Recursion.Basic;

// if n is odd reduce by 1
// if it is even divide by 2
// until n becomes zero
//count no. of steps to reduce it to zero
public class ReduceNumberToZero {
    public static void main(String[] args) {
        System.out.println(reduceToZero(7));
    }
    static int reduceToZero(int n){
        return reduceToZeroHelper(n,0);
    }
    static int reduceToZeroHelper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            return reduceToZeroHelper(n/2,count+1);
        }
        return reduceToZeroHelper(n-1,count+1);
    }
}
