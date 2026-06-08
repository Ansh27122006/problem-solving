package advanced.dsa.objectclass;

public class ObjectArray {
    public static void main(String[] args) {
        Object[] arr={4,4.5,'H',"Abc"};
        int n=(int)arr[0]+3;
        System.out.println(n);

        String s1="Abc";
        String s2=new String("Abc");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }
}
