package com.java8.streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//program to count each occurrences of character
public class Program11 {
    public static void main(String[] args) {
        String str = "aabaccdefwelA";
        LinkedHashMap<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(result);
    }
}
