package adi.Basic;

public class gcd {
    static int gcd(int a, int b){
        int min=Math.min(a,b);
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }
    //Euclidean algo iterative
    static int gcd2(int a, int b){
        int min=Math.min(a,b);
        while(min!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
            min=Math.min(a,b);
        }
        return Math.max(a,b);
    }
    //Euclidean algo iterative
    static int gcd3(int a, int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    //Euclidean algo recursive
    static int gcd4(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(12,18));//6
        System.out.println(gcd2(12,18));
        System.out.println(gcd3(12,18));
        System.out.println(gcd4  (12,18));
    }

}
