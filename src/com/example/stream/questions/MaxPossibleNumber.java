package com.example.stream.questions;
//max possible number means  rearrange numbers (or digits) to form the largest possible number
//for example--i/p={1,2,9,4}--->o/p=9421.
//Q. Find max possible number .

import java.util.*;
import java.util.stream.*;
public class MaxPossibleNumber {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 7, 9, 11, 13, 99);
            System.out.println("print the list:" + list);
            String result= list.stream()
                    .map(String::valueOf)
                    .sorted((a,b)->(b+a).compareTo(a+b))
                    .collect(Collectors.joining());
        System.out.println("max possible number is:" + result);
    }
}
