package com.example.stream.questions;
import java.util.*;
import java.util.stream.*;
public class MinNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 7, 9, 11, 13, 99);
        System.out.println("print the list:" + list);
        int minNo= list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(0);
        System.out.println("Print the minimum no of the list:"+minNo);
    }
}
