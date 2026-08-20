package adi.string;

public class SubString {
    static void subString(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub="";
                for(int k=i;k<=j;k++){
                    sub+=s.charAt(k);
                }
                System.out.println(sub);
            }
        }
    }
    public static void main(String[] args) {
        subString("abc");
    }
}
