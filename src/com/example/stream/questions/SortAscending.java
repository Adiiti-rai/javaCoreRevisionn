package com.example.stream.questions;
// sort elements in ascending order
import java.util.*;
import java.util.stream.*;
public class SortAscending {
    public static void main(String[] args){
        List<Integer>list= Arrays.asList(-1,3,5,0,7,-6,4);
        System.out.println("Original list: " + list);
        List<Integer>result= list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted list in ascending order: " + result);
    }
}
