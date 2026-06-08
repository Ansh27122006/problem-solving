package advanced.dsa.codeforces;

import java.util.HashMap;

public class RegistrationSystem4C {
    static HashMap<String, Integer> map = new HashMap<>();
    static String registration(String name){
        if(map.containsKey(name)){
            int count = map.get(name);
            map.put(name,count+1);
            return name+count;
        }
        map.put(name,1);
        return "OK";
    }
    public static void main(String[] args) {
        System.out.println(registration("abacaba"));
        System.out.println(registration("acaba"));
        System.out.println(registration("abacaba"));
        System.out.println(registration("acab"));
        System.out.println(registration("first"));
        System.out.println(registration("first"));
        System.out.println(registration("second"));
        System.out.println(registration("second"));
        System.out.println(registration("third"));
        System.out.println(registration("third"));
    }
}
