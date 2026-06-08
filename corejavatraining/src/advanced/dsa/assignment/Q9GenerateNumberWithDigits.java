package advanced.dsa.assignment;

public class Q9GenerateNumberWithDigits {
    static void generate(int[] digits, int n, String s){
        if(s.length()==n) {
            System.out.print(s+" ");
            return;
        }
        for(int i=0;i<digits.length;i++){
            generate(digits,n,s+digits[i]);
        }
    }
    public static void main(String[] args) {
        int[] d1= {1, 2, 3};
        generate(d1,2,"");
    }
}
