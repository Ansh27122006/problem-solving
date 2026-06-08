package advanced.dsa.recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    static void towerOfHanoi(int n, char source, char helper, char dest){
        if(n==0) return;

        towerOfHanoi(n-1, source, dest, helper);
        System.out.println(n+":"+source+"->"+dest);
        towerOfHanoi(n-1, helper, source, dest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoi(n,'A','B','C');
    }
}
