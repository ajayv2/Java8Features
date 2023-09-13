package com.java8.optionalclassdemo;

import java.util.Optional;

public class Program1 {
    public static void main(String[] args) {
        String str = "test null";
        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        System.out.println(optional.orElse("No value"));

    }
}
