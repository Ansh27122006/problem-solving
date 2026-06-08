package edu.cu.training.java.basics.oops;


class A1{
    void show(){
        System.out.println("In class A");
    }
}
class B1 extends A{
    void show(){
        System.out.println("In class B");
    }
}
public class PolymrphicNature {
    public static void main(String[] args) {
        A a1=new B();
        a1.show();
    }
}
