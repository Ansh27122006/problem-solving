package adi.customSorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayInDec {
    public static void main(String[] args) {
        Integer[] arr = {705,509,403,203,108};
        Arrays.sort(arr,( a, b)->b-a);
        System.out.println(Arrays.toString(arr));
    }
}
