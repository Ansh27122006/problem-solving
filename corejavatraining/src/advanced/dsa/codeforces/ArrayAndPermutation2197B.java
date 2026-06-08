package advanced.dsa.codeforces;

public class ArrayAndPermutation2197B {
    static void check(int n,int[] arr, int[] perm){
        for(int i=0;i<n;i++){
            if(arr[i]!=perm[i]){
                if(i==0){
                    if(perm[i]!=perm[i+1] && perm[i]!=arr[i+1]){
                        System.out.println("NO");
                        return;
                    }
                }else if(i==n-1){
                    if(perm[i]!=perm[i-1] && perm[i]!=arr[i-1]){
                        System.out.println("NO");
                        return;
                    }
                }else{
                    if(perm[i]!=perm[i+1] && perm[i]!=perm[i-1] && perm[i]!=arr[i+1] && perm[i]!=arr[i-1]) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        int n=3;
        int[] arr={1,2,3};
        int[] perm={1,2,2};
        check(n,arr,perm);
        int n1=4;
        int[] arr1={3,1,2,4};
        int[] perm1={3,4,2,2};
        check(n1,arr1,perm1);
        int n2=5;
        int[] arr2={1,3,2,5,4};
        int[] perm2={3,3,3,5,4};
        check(n2,arr2,perm2);
        int n3=7;
        int[] arr3={3,7,4,2,1,6,5};
        int[] perm3={3,3,4,4,5,6,5};
        check(n3,arr3,perm3);
        int n4=7;
        int[] arr4={1,2,3,4,5,6,7};
        int[] perm4={7,7,7,7,7,7,7};
        check(n4,arr4,perm4);
        int n5=7;
        int[] arr5={1,3,2,7,5,4,6};
        int[] perm5={2,2,7,7,7,5,6};
        check(n5,arr5,perm5);
    }
}
