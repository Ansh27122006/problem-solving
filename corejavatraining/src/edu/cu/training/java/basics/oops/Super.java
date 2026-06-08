package edu.cu.training.java.basics.oops;

class A {
    void show() {
        System.out.println("In class A");
    }
}

class B extends A{
    void show(){
        System.out.println("In class B");
    }
    void showA(){
        super.show();
    }
}

public class Super{
    public static void main(String[] args) {
        B b=new B();
        b.show();
        b.showA();
    }
}
