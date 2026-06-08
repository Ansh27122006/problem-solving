package edu.cu.training.java.basics.Basic;

public class Student{
    int a,b;
    static int c=0;
    Student(int a,int b){
        this.a=a;
        this.b=b;
        c++;
    }
    void show(){
        System.out.println(a+" "+b);
    }
    static void showStatic(){
        System.out.println(c);
    }
}