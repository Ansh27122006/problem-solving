package advanced.dsa.codeforces;

public class Decoding746B {
    static String decode(int n,String s){
        String str = "";
        //(0->right) (1->left)
        int e=(n%2==0)?1:0;
        for(char ch:s.toCharArray()){
            if(e==0){
                str=str+ch;
                e=1;
            }else{
                str=ch+str;
                e=0;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(decode(5,"logva"));
        System.out.println(decode(2,"no"));
        System.out.println(decode(4,"abba"));
    }
}
