package com.example.stream.questions;

import java.util.*;
import java.util.stream.*;

public class OddNumber {
    public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 2, 4, 5, 7, 9, 11, 13, 99);
            System.out.println("print the list:" + list);
            List<Integer>oddNo= list.stream()
                    .filter(x->x%2!=0)
                    .collect(Collectors.toList());
            System.out.println("print the odd number:" + oddNo);

        }
    }


