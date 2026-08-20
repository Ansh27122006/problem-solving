package pauj.mystreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class removeDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,1,2,4,6,4,7);
        Stream<Integer> stream = list.stream();
        Stream<Integer> s2 = stream.distinct();
        s2.forEach((n)-> System.out.println(n+" "));
    }
}
