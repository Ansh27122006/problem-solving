package advanced.dsa.test;

public class MatchPairs {
    static int formPairs(int a, int b, int c, int d){
        if(a==c && b==d){
            return 1;
        }
        int sum=a+b;
        if(sum>c && sum>d){
            return 0;
        }
        int t=0,s=0;
        if(sum<=c){
            t=formPairs(sum,b,c,d);
        }
        if(sum<=d){
            s=formPairs(a,sum,c,d);
        }
        if(t==1 || s==1) return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(formPairs(1,3,4,3));
    }
}
