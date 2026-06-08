package advanced.dsa.assignment;

public class Q8FirstUniqueChInString {
    static int firstUnique(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstUnique("leetcode"));//0
        System.out.println(firstUnique("loveleetcode"));//2
        System.out.println(firstUnique("aabb"));//-1

    }
}
