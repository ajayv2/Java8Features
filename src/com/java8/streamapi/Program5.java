package com.java8.streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Program5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,12,32,33,13,19);
        //find out all the odd numbers from given list
        list.stream().filter(x->x%2!=0).forEach(x->System.out.print(x+" "));
        System.out.println();
        //find out all the numbers starting with 1
        list.stream().map(x->x+" ").filter(y->y.startsWith("1")).forEach(x->System.out.print(x+" "));
        //find the first elements from given list
        System.out.println();
        System.out.println("First element in the given list is ");
        list.stream().findFirst().ifPresent(System.out::println);
        System.out.println("total no of elements present in the list");
        System.out.println(list.stream().count());
        System.out.println("max value present in list "+list.stream().max(Integer::compareTo).get());
        System.out.println("find first non-repeating character in given string");
        String str = "welcomeweloc";
        String s = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(s);
        System.out.println("find first repeating character in given string");
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey)
                .findFirst().ifPresent(System.out::println);
    }
}
