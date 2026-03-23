package com.example.stream.questions;

import java.util.*;
import java.util.stream.*;
public class MinPossibleNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 7, 9, 11, 13, 99);
        System.out.println("print the list:" + list);
        String result = list.stream()
                .map(String::valueOf)
                .sorted((a, b) -> (a + b).compareTo(b + a))
                .collect(Collectors.joining());
        System.out.println("the minimum possible number is:" + result);

    }
}