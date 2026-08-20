package pauj.mystreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Filter {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10,20,-3, -4,90,-32);
//        Stream<Integer> stream = list.stream();
//
//        Stream<Integer> positive = stream.filter((num)->num>0);
//        positive.forEach((n)-> System.out.println(n+" "));

//        int res=positive.reduce(0,(a,b)->a+b);
//        System.out.println(res);
        List<Integer> list = Arrays.asList(10, 20, -3, -4, 90, -32);

        List<Integer> positive = list.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());

        System.out.println(positive);
    }
}
