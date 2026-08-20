package adi.Basic;

public class DistributeInACircle {
    static int dist(int n, int m, int s){
        for(int i=1;i<m;i++){
            s++;
            if(s>n){
                s=1;
            }
        }
        return s;
    }
    static int dist2(int n, int m, int s){
        int r=(m%n)+s-1;
        if(r==0) return n;
        return r;
    }
    public static void main(String[] args) {
        System.out.println(dist(5,2,1));
        System.out.println(dist(5,8,2));
        System.out.println(dist2(5,2,1));
        System.out.println(dist2(5,8,2));
        System.out.println(dist2(5,25,2));
    }
}
