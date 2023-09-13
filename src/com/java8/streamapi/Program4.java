package com.java8.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//program to print square of first 10 prime numbers
public class Program4 {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(1, i -> i + 1).filter(Program3::isPrime)
                .peek(System.out::println)
                .map(x -> x * x).limit(10).collect(Collectors.toList());
        System.out.println(list);
    }
}
