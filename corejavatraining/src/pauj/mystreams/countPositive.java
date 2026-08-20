package pauj.mystreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class countPositive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,-4,-5,6,-30);
        Stream<Integer> stream = list.stream();
        long count=stream.filter((n)->n>0).count();
        System.out.println(count);
    }
}
