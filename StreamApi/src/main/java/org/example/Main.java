package org.example;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filteredNum = num.stream().filter(m -> m%2 != 0).map(n -> n*2).collect(Collectors.toList());
        System.out.println(filteredNum);

        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "apricot");
        List<String> filteredWords = words.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredWords);

        Integer sum = num.stream()
                .filter(n -> n <= 5).
                map(m -> m * 3).
                reduce(0, Integer::sum);
        System.out.println(sum);

        Map<Integer,List<String>> collectedStringsInMap = words.stream()
                .sorted().
                collect(Collectors.groupingBy(String::length));
        System.out.println(collectedStringsInMap);
    }
}