package com.example.stream.questions;
// print element greater than 9
import java.util.*;
import java.util.stream.*;
public class GreaterNumber {
    public static void main(String[] args){
        List<Integer>list= Arrays.asList(1,2,4,5,7,9,11,13,99);
        System.out.println("print the list:"+list);
        List<Integer>result= list.stream()
                .filter(x->x>9)
                .collect(Collectors.toList());
        System.out.println("print the greater number than 9:"+result);

    }
}
