package advanced.dsa.ExceptionHandling;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a,b;
        try(Scanner sc=new Scanner(System.in)){
            a=sc.nextInt();
            b=sc.nextInt();
            int result = a/b;
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
