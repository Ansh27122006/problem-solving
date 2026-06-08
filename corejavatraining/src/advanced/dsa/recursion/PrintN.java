package advanced.dsa.recursion;

public class PrintN {
    static void func(int n){
        if(n<=0) return;
        func(n-1);
        System.out.println(n);

    }
    static void rev(int n){
        if(n<=0) return;
        System.out.println(n);
        rev(n-1);

    }
    public static void main(String[] args) {
        func(5);
    }
}
