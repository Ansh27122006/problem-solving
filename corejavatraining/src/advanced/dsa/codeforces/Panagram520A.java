package advanced.dsa.codeforces;

import java.util.HashSet;
import java.util.Set;

public class Panagram520A {
    static boolean checkPanagram(int n, String s1){
        String s=s1.toLowerCase();
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0) return false;
        }
        return true;
    }
    static boolean checkPanagram(String s1){
        String s=s1.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        if(set.size()==26) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkPanagram(12,"toosmallword"));
        System.out.println(checkPanagram(35,"TheQuickBrownFoxJumpsOverTheLazyDog"));
        System.out.println(checkPanagram("toosmallword"));
        System.out.println(checkPanagram("TheQuickBrownFoxJumpsOverTheLazyDog"));
    }
}
