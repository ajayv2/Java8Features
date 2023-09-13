package com.java8.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//program to find duplicate with its count
public class Program10 {
    public static void main(String[] args) {
        String[] str = {"A","B","A","C"};
        List<String> list = Arrays.asList(str);
        Map<String, Long> result = Arrays.stream(str).filter(x -> Collections.frequency(list, x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
