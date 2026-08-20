package pauj.mystreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class convertUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","Def","HELLO","World","Learning","Streams","Hi");
        Stream<String> s = list.stream()
                .map((s1)->s1.toUpperCase());
        s.forEach((s1)-> System.out.println(s1+" "));
        System.out.println();

        //uppercase string where length greater than 4
        Stream<String> st2 = list.stream()
                .map((s1)->{
                    if(s1.length()>4) s1=s1.toUpperCase();
                    return s1;
                });
        st2.forEach((s1)-> System.out.println(s1+" "));
        System.out.println();

        //uppercase string where length greater than 4
        Stream<String> st = list.stream()
                .filter((s1)->{
                    return s1.length()>4;
                }).map(String::toUpperCase);
        st.forEach((s1)-> System.out.println(s1+" "));
        System.out.println();

//      strings start with a
        Stream<String> st3=list.stream()
                .filter((String s1)->s1.toUpperCase().startsWith("A"));
        st3.forEach((s1)-> System.out.println(s1+" "));
    }
}
