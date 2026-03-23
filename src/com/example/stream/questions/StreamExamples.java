package com.example.stream.questions;
import java.util.*;
import java.util.stream.*;
public class StreamExamples {
    public static void main(String[] args) {
        List<String> list = List.of("Test", "java", "Anshu", "Garima", "Vanshika", "Aditi");
        System.out.println("print the list:" + list);

//1.sort element in ascending order.
        List<String> result = list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("sorted list:" + result);

//2.sort element in descending order.
        List<String> result1 = list.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
        System.out.println("sorted list in descending order:" + result1);

        //3.Find String with maximum length.
        String max = list.stream()
//                .sorted(Comparator.comparingInt(String::length).reversed())
//                .findFirst()
//                .orElse(null);
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("String with maximum length:" + max);

        //4.Find String with minimum length.
        String min = list.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("String with minimum length:" + min);

        //5.print string name start with "G".
        List<String> result2 = list.stream()
                .filter(x -> x.startsWith("G"))
                .collect(Collectors.toList());
        System.out.println("String name start with G:" + result2);

        //6.add @epam.com to each String.
        List<String> result3 = list.stream()
                .map(x -> x + "@epam.com")
                .collect(Collectors.toList());
        System.out.println("add @epam.com to each String:" + result3);

        //7. print String with max vowels.
        String maxVowels = list.stream()
                .max(Comparator.comparingInt(x -> countVowels(x)))
                // countVowels is a static method,It  belongs to the class not object.
                .orElse(null);
        System.out.println("String with max vowels:" + maxVowels);

        //8. print String with min vowels.
        String minVowels = list.stream()
                .min(Comparator.comparingInt(x->countVowels(x)))
                .orElse(null);
        System.out.println("String with min vowels:" + minVowels);

        //9.convert List to map. map Key should be string nad value should be length of string.
        Map<String,Integer>map= list.stream()
                .collect(Collectors.toMap(x->x,x->x.length()));
        System.out.println("convert List to map:" + map);

        //10.find duplicates elements.
        List<String>map1= list.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()>1)
                .map(x->x.getKey())
                .collect(Collectors.toList());
        System.out.println("find duplicates elements:" + map1);

       //11.Find unique elemnts in the list
        List<String>uniqueElemnts= list.stream()
                .collect(Collectors.groupingBy(x->x,Collectors.counting()))
        .entrySet()
                .stream()
                .filter(x->x.getValue()==1)
                .map(x->x.getKey())
                .collect(Collectors.toList());
        System.out.println("find unique elemnts in the list:" + uniqueElemnts);

        //12.convert all elements to upperCase.
        List<String>upperCase= list.stream()
                .map(String::toUpperCase)
        .collect(Collectors.toList());
        System.out.println("convert all elements to upperCase:" + upperCase);
    }

    // // Helper method to count vowels
    public static int countVowels(String str) {
        return (int) str.toLowerCase()
                .chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
