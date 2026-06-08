package advanced.dsa.assignment;

import java.util.Stack;

public class Q1ParenthesesChecker {
    public static boolean check(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                else if(ch==')' && stack.peek()=='('){
                    stack.pop();
                }else if(ch=='}' && stack.peek()=='{'){
                    stack.pop();
                }else if(ch==']' && stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(check("()"));
        System.out.println(check("()[]{}"));
        System.out.println(check("(]"));
        System.out.println(check("([])"));
        System.out.println(check("([)]"));
        System.out.println(check("["));
    }
}
