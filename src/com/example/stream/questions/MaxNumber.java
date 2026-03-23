package com.example.stream.questions;

import java.util.*;
import java.util.stream.*;

public class MaxNumber {
    public static void main(String[] args){
        List<Integer>list= Arrays.asList(1,2,4,5,7,9,11,13,99);
        System.out.println("print the list:"+list);
        int maxNo= list.stream()
                .mapToInt(Integer::intValue)
                        .max()
                        .orElse(0);
        System.out.println("print the maximum number:"+maxNo);

    }
}
