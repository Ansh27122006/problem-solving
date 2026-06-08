package advanced.dsa.recursion;

import java.util.Scanner;

public class BoardPath {
    static void diceRoll(int n, int totalSum,String path){
        if(totalSum>n){
            return;
        }
        if(totalSum==n){
            System.out.println(path);
        }
        for(int i=1;i<=6;i++){
            diceRoll(n,totalSum+i, path+i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        diceRoll(n,0, "");
    }
}
