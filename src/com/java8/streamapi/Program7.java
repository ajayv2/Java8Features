package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//concat two stream
public class Program7 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java","8");
        List<String> list2 = Arrays.asList("explained","through","programs");
        Stream<String> concated = Stream.concat(list1.stream(), list2.stream());
        concated.forEach(str->System.out.print(str+" "));
    }
}
