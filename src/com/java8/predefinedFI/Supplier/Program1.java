package com.java8.predefinedFI.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Program1 {
    public static void main(String[] args) {
//        Supplier<Date> s = Date::new;
        Supplier<Date> s = ()->new Date();
        System.out.println(s.get());
    }
}
