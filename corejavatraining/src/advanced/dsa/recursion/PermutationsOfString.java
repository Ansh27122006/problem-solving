package advanced.dsa.recursion;

import java.util.Scanner;

public class PermutationsOfString {
    static void permute(String p, String s){
        if(s.isBlank()){
            System.out.println(p);
            return;
        }
        for(int i=0;i<=p.length();i++){
            char ch=s.charAt(0);
            String first=p.substring(0,i);
            String second=p.substring(i);
            permute(first+ch+second,s.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        permute("","abc");
    }
}
