package dsa.Recursion.Basic;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(-1020450800));
    }
    static int countZeros(int n){
        if(n<0){
           return countZeros(-n);
        }
        return countZerosHelper(n,0);
    }
    static int countZerosHelper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return countZerosHelper(n/10,count+1);
        }
        return countZerosHelper(n/10,count);
    }
}
