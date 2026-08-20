package adi.customSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringsByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","Hi","Hello","good","DSA");
        Comparator<String> acc = (a,b)->a.length()>b.length()?1:-1;
        Collections.sort(list,acc);
        System.out.println(list);

        Collections.sort(list,(a,b)->a.length()>b.length()?-1:1);
        System.out.println(list);
    }
}
