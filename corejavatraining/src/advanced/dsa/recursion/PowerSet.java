package advanced.dsa.recursion;

public class PowerSet {
    static void powerSet(char arr[]){
        int n=arr.length;
        for(int mask=0;mask<(1<<n);mask++){
            for(int i=0;i<n;i++){
                if((mask&(1<<i))!=0){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char arr[]={'a','b','c'};
        powerSet(arr);
    }
}
