package com.example.stream.questions;

import java.util.*;
import java.util.stream.*;
public class MoveZeroToLeft {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 5, 0, 8, 0);
        System.out.println("print the list:" + list);
        List<Integer>result= Stream.concat(
                list.stream()
                        .filter(x->x==0),
                list.stream()
                        .filter(x->x!=0))
                .collect(Collectors.toList());
        System.out.println("print the result:" + result);

    }
}