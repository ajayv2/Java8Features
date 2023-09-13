package com.java8.streamapi;

import java.util.stream.Stream;

public class StreamOfDemo {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(9,99,999,9999);
        s.forEach(i->System.out.print(i+" "));
    }
}
