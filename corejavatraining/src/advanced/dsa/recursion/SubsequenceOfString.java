package advanced.dsa.recursion;

import java.util.Scanner;

public class SubsequenceOfString {
    static void ss(String s, String sub){
        if(s.isEmpty()){
            if(sub.isEmpty()){
                System.out.println("\"\"");
                return;
            }
            System.out.println(sub);
            return;
        }
        char ch=s.charAt(0);
        ss(s.substring(1),sub+ch);
        ss(s.substring(1),sub);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ss(str,"");
    }
}
