package advanced.dsa.recursion;

public class PrintDigits {
    static void print(int n){
        if(n==0){
            System.out.println(0);
            return;
        }
        print2(n);
    }
    static void print2(int n){
        if(n==0){
            return;
        }
        print2(n/10);
        System.out.println(n%10);
    }
    static void print3(int n){
        if(n<0){
            return;
        }
        if(n%10!=0){
            print3(n/10);
        }
        System.out.println(n%10);
    }
    static void print4(int n){
        if(n<0){
            return;
        }
        if(n%10!=0){
            print2(n/10);
        }
        System.out.println(n%10);
    }
    public static void main(String[] args) {
        print3(3234567);
    }
}
