package advanced.dsa.test;

import java.util.Arrays;

public class LongestPermutationDigit {
    static String find(String s){
        StringBuilder str=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                str.append(ch);
            }
        }
        char[] arr=str.toString().toCharArray();
        Arrays.sort(arr);
        StringBuilder st=new StringBuilder(new String(arr));
        st.reverse();
        return st.toString();
    }
    public static void main(String[] args) {
        System.out.println(find("a4b2cd6e564"));
    }
}
