package adi.Basic;

public class primeFactors {
    static void prime(int n){
        for(int i=2;i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        System.out.println();
    }
    static void primeO1(int n){
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n!=1){
            System.out.print(n);
        }
        System.out.println();
    }
    static void primeO2(int n){
        while(n%2==0){
            System.out.print(2+" ");
            n=n/2;
        }
        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n!=1){
            System.out.print(n);
        }
        System.out.println();
    }
    static void primeR(int n, int f){
        if(n<=1) return;
        if(n%f==0){
            System.out.print(f+" ");
            primeR(n/f,f);
        }else{
            primeR(n,f+1);
        }
    }
    static void primeR2(int n, int f){
        if(f*f>n){
            if(n!=1) System.out.print(n);
            return;
        }
        if(n%f==0){
            System.out.print(f+" ");
            primeR2(n/f,f);
        }else{
            primeR2(n,f+1);
        }
    }

    static void primeR3(int n, int f){
        if(f*f>n){
            if(n!=1) System.out.print(n);
            return;
        }
        if(f==2){
            if(n%2==0){
                System.out.print(2+" ");
                primeR3(n/2,2);
            }else {
                primeR3(n,f+1);
            }
        }else if(n%f==0){
            System.out.print(f+" ");
            primeR3(n/f,f);
        }else{
            primeR3(n,f+2);
        }
    }

    public static void main(String[] args) {
//        prime(18);
//        primeO1(18);
//        primeO2(19);
        primeR2(18,2);
        System.out.println();
        primeR3(18,2);
    }
}
