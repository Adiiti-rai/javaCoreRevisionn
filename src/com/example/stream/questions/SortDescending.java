package com.example.stream.questions;
//sort the list in descending order.
import java.util.*;
import java.util.stream.*;
public class SortDescending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1, 3, 5, 0, 7, -6, 4);
        System.out.println("Original list: " + list);
        List<Integer>result= list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted list in descending order: " + result);
    }
}
