package advanced.dsa.recursion;

import java.util.Scanner;

public class CoinToss {
    static void coinToss(int n, String possible){
        if(n<=0){
            System.out.println(possible);
            return;
        }
        coinToss(n-1,possible+"H");
        coinToss(n-1,possible+"T");
    }
    static void coinToss2(int n, String possible){
        if(n<=0){
            System.out.println(possible);
            return;
        }
        if(possible.isEmpty()||possible.charAt(possible.length()-1)!='H'){
            coinToss2(n-1,possible+"H");
        }
        coinToss2(n-1,possible+"T");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        coinToss2(n,"");
    }
}
