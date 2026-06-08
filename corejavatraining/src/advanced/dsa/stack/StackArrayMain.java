package advanced.dsa.stack;

class MyStackArray {
    int size;
    int top;
    int[] arr;

    MyStackArray(int n){
        size=n;
        top=-1;
        arr=new int[n];
    }

    boolean push(int ele){
        if(isFull()) return false;
        arr[++top]=ele;
        return true;
    }

    boolean isFull(){
        return top==size-1;
    }

    int pop(){
        if(isEmpty()) return -1;
        return arr[top--];
    }

    boolean isEmpty(){
        return top==-1;
    }

    int peek(){
        if(isEmpty()) return -1;
        return arr[top];
    }

    void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class StackArrayMain{
    public static void main(String[] args) {
        MyStackArray stack=new MyStackArray(5);
        stack.push(3);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.display();
    }
        }