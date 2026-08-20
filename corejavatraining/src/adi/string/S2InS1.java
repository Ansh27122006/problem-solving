package adi.string;

//occurences of string 2 in string 1
public class S2InS1 {
    static int occur(String s1, String s2){
        int i=0, j=s2.length(), count=0;
        while(j<=s1.length()){
            if(s1.substring(i,j).equals(s2))  {
                count++;     
            }
            i++;j++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s1="abbabbaa";
        String s2="abba";
        System.out.println(occur(s1,s2));
        s1="abcdabcabcdf";
        s2="abcdf";
        System.out.println(occur(s1,s2));
    }
}
