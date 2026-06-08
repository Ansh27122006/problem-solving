package advanced.dsa.codeforces;

public class ASquare2167A {
     static void square(int a, int b, int c, int d){
        if(a!=b || a!=c || a!=d){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
    public static void main(String[] args) {
        square(1,2,3,4);
        square(1,1,1,1);
        square(2,2,2,2);
        square(1,2,1, 2);
        square(1,1,5,5);
        square(5,5,5,5);
        square(4,5,10,9);
    }
}
