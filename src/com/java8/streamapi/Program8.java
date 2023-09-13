package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;

//program to perform cube on list and filter numbers greater than 50
public class Program8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,1,5,2);
        list.stream().map(i->i*i*i).filter(x->x>50).forEach(System.out::println);
    }
}
