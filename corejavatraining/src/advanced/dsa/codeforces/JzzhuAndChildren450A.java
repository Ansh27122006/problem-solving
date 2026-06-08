package advanced.dsa.codeforces;

public class JzzhuAndChildren450A {
    static int last(int n, int m, int[] arr){
        int last=0;
        for(int i=0;i<n;i++){
            if(arr[i]>m && arr[i]>arr[last]){
                last=i;
            }
        }
        return (last!=0)?last+1:n;
    }
    public static void main(String[] args) {
        int[] arr1={1,3,1,4,2};
        System.out.println(last(5,2,arr1));
        int[] arr2={1,1,2,2,3,3};
        System.out.println(last(6,4,arr2));
    }
}
