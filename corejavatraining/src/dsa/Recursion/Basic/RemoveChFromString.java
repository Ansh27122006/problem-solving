package dsa.Recursion.Basic;

public class RemoveChFromString {
    static String removeCh(String s,char ch){
        if(s.isEmpty()){
            return s;
        }
        if(s.charAt(0)==ch){
            return removeCh(s.substring(1),ch);
        }else {
            return s.charAt(0)+removeCh(s.substring(1),ch);
        }
    }
    public static void main(String[] args) {
        System.out.println(removeCh("baccad",'c'));
    }
}
