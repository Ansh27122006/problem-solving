package pauj.mystreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,-4,-5,6,-30);
        Optional o= list.stream().max(Integer::compareTo);
        Optional o2= list.stream().min(Integer::compareTo);
//        if(o.orElse(-1).equals(-1)) System.out.println(o);
        System.out.println(o+" "+o2);
    }
}
