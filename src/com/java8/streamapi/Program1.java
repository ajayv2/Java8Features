package com.java8.streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//find all occurrences of given word in the given string
public class Program1 {
    public static void main(String[] args) {
        String str = "welcome to V2Solutions and V2Solutions welcome you";
         Map<String,Long> map= Arrays.asList(str.split(" ")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
