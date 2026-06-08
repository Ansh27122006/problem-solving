package advanced.dsa.codeforces;

public class DisplayTheNumber1295A {
    static int display(int segments){
        int result=0;
        if(segments%2==0){
            result=1;
        }else{
            result=7;
        }
        for(int i=0;i<(segments/2)-1;i++){
            result=result*10+1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(display(2));
        System.out.println(display(3));
        System.out.println(display(8));
        System.out.println(display(9));
        System.out.println(display(11));
        System.out.println(display(12));
    }
}
