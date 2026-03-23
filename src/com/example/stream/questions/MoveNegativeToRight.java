package com.example.stream.questions;

//move all negative numbers to the right side
import java.util.*;
import java.util.stream.*;
public class MoveNegativeToRight {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1, 3, 5, 0, 7, -6, 4);
        System.out.println("print the original List:" + list);
        List<Integer> result = Stream.concat(
                        list.stream()
                                .filter(x -> x >= 0),
                        list.stream()
                                .filter(x -> x < 0))
                .collect(Collectors.toList());
        System.out.println("print the result List:" + result);

    }
}
