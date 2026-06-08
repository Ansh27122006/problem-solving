package dsa.Recursion.Basic;

public class RemoveSubStringFromString {
    static String removeString(String s,String sub){
        if(s.isEmpty()){
            return s;
        }else if(s.startsWith(sub)){
            return removeString(s.substring(sub.length()),sub);
        }
        return s.charAt(0)+removeString(s.substring(1),sub);
    }
    public static void main(String[] args) {
        System.out.println(removeString("happentoappleapp","app"));
    }
}
