package pauj.mystreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class positivesquaresum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,-4,-5,6,-30);
        int sum = list.stream().filter((n)->n>0).
                map((x)->x*x).
                reduce(0,(a,b)->a+b);

        System.out.println(sum);
    }
}
