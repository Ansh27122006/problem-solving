package advanced.dsa.stack;

import java.util.Stack;

public class removeConsecutive {
    static String removeConsecutive(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && ch==stack.peek()){
                continue;
            }
            stack.push(ch);
        }
        StringBuilder str=new StringBuilder();
        for(char e:stack) str.append(e);

        return str.toString();
    }
    static String removeConsecutive2(String s){
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()) {
            if (str.length()!=0 && ch == str.charAt(str.length()-1)) {
                continue;
            }
            str.append(ch);
        }

        return str.toString();
    }
    public static void main(String[] args) {
        String s1="aabcsa";
        System.out.println(removeConsecutive2(s1));
        String s2="pqqrrsrt";
        System.out.println(removeConsecutive2(s2));
    }
}
