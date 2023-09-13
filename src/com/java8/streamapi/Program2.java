package com.java8.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//find the duplicate integers present in the given integers list
public class Program2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,28,87,10,20,76,28,80);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(x->!set.add(x)).forEach(System.out::println);
    }
}
