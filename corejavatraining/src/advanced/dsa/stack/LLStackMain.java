package advanced.dsa.stack;

class MyLLStack{
    Node head;
    int size;
    class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data=data;
        }
    }
    MyLLStack(){
        size=0;
    }
    boolean push(int ele){
        if(isFull()) return false;
        Node newnode=new Node(ele);
        newnode.next=head;
        if(head!=null) head.previous=newnode;
        head=newnode;
        size++;
        return true;
    }

    boolean isFull(){
        return false;
    }

    int pop(){
        if(isEmpty()) return -1;
        int pop= head.data;
        head=head.next;
        if(head!=null) head.previous=null;
        size--;
        return pop;
    }

    boolean isEmpty(){
        return size==0;
    }

    int peek(){
        if(isEmpty()) return -1;
        return head.data;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class LLStackMain {
    public static void main(String[] args) {
        MyLLStack stack=new MyLLStack();
        stack.push(100);
        stack.push(101);
        stack.push(102);
        stack.push(103);
        stack.push(104);
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
    }
}

