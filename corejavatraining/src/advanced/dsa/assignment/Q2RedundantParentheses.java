package advanced.dsa.assignment;

import java.util.Stack;
// given that string is balanced
public class Q2RedundantParentheses {
    public static boolean check(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                stack.push(ch);
            }else if(ch==')'){
                if(stack.peek()=='(') return true;
                stack.pop();
                stack.pop();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(check("((a+b))"));
        System.out.println(check("(a+(b)/c)"));
        System.out.println(check("((a+b)*c)"));
    }
}
