package adi.customSorting;

import java.util.*;

public class SortAccToLastDigit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(705,509,403,203,108);
        Comparator<Integer> acc = (a , b) -> a%10>b%10?1:-1;
        Collections.sort(list,acc);
        System.out.println(list);
        Comparator<Integer> dec = (a , b) -> {
            if(a%10>b%10) return -1;
            return 1;
        };
        Collections.sort(list,dec);
        System.out.println(list);
    }
}
