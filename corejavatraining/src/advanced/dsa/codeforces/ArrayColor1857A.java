package advanced.dsa.codeforces;

public class ArrayColor1857A {
    static void color(int n, int[] arr){
       int odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0) odd++;
        }

        if(odd%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,3,2,3,5,4};
        color(8,arr);
        int[] arr1={4,7};
        color(2,arr1);
        int[] arr2={3,9,8};
        color(3,arr2);
        int[] arr3={1,7};
        color(2,arr3);
        int[] arr4={5,4,3,2,1};
        color(5,arr4);
        int[] arr5={4,3,4,5};
        color(4,arr5);
        int[] arr6={50,48};
        color(22,arr6);
    }
}
