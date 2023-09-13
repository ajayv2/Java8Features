package com.java8.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {
    public static void main(String[] args) {
        //example of map
        List<String> myList = Stream.of("a","b").map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(myList);
        //example of flatmap
        List<List<String>> list = Arrays.asList(Arrays.asList("a"),Arrays.asList("b"));
        System.out.println(list.stream().flatMap(Collection::stream).map(String::toUpperCase).collect(Collectors.toList()));
    }
}
