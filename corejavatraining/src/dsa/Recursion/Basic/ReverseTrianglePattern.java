package dsa.Recursion.Basic;
//n=5
//*****
//****
//***
//**
//*
public class ReverseTrianglePattern {
    static void print(int n,int c){
        if(n==0){
            return;
        }else if(c==0){
            System.out.println();
            print(n-1,n-1);
        }else{
            System.out.print("*");
            print(n,c-1);
        }
    }
    public static void main(String[] args) {
        print(5,5);
    }
}
