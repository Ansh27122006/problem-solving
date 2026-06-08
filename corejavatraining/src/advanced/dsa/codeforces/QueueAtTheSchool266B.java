package advanced.dsa.codeforces;

public class QueueAtTheSchool266B {
    static String arrange(int n, int time, String s){
        char[] str=s.toCharArray();
        for(int j=0;j<time;j++){
            for(int i=0;i<s.length()-1;i++){
                if(str[i]=='B' && str[i+1]=='G'){
                    char temp=str[i];
                    str[i]=str[i+1];
                    str[i+1]=temp;
                    i++;
                }
            }
        }
        return new String(str);
    }
    public static void main(String[] args) {
        System.out.println(arrange(5,1,"BGGBG"));
        System.out.println(arrange(5,2,"BGGBG"));
        System.out.println(arrange(4,1,"GGGB"));
    }
}
