package advanced.dsa.stack;

public class ReverseNumber {
    static int reverseNumber(int n){
        MyStackArray stack=new MyStackArray(30);
        while(n>0){
            stack.push(n%10);
            n=n/10;
        }
        MyStackArray stack2=new MyStackArray(30);
        while(!stack.isEmpty()){
            stack2.push(stack.pop());
        }
        n=0;
        while(!stack2.isEmpty()){
            n=n*10+stack2.pop();
        }
        return n;
    }
    static int reverseNumber2(int n){
        int ans=0;
        while(n>0){
            ans=ans*10+n%10;
            n=n/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber2(12345));
    }
}
