package advanced.dsa.stack;


class StackArray {
    int size;
    int top;
    char[] arr;

    StackArray(int n){
        size=n;
        top=-1;
        arr=new char[n];
    }

    boolean push(char ele){
        if(isFull()) return false;
        arr[++top]=ele;
        return true;
    }

    boolean isFull(){
        return top==size-1;
    }

    char pop(){
        if(isEmpty()) return '0';
        return arr[top--];
    }

    boolean isEmpty(){
        return top==-1;
    }

    char peek(){
        if(isEmpty()) return '0';
        return arr[top];
    }

    void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class ReverseString {
    static String reverse(String s){
        StackArray stack=new StackArray(s.length());
        for(char ch:s.toCharArray()){
            stack.push(ch);
        }
        StringBuilder str=new StringBuilder();
       while(!stack.isEmpty()){
            str.append(stack.pop()+"");
        }
       return str.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("Java Coding"));
    }
}
