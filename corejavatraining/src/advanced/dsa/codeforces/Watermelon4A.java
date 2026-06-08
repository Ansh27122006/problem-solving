package advanced.dsa.codeforces;

public class Watermelon4A {
    static void divide(int n){
        if(n%2!=0 || n<=2){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        divide(8);
    }
}
