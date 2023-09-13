package com.java8.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//given an integer arrays returns true if any value appears twice and returns false if all values are unique
public class Program6 {
    public static void main(String[] args) {
        int[] arr = {10,2,3,4,5};
        boolean b = checkValue(arr);
        System.out.println(b);
    }
    public static boolean checkValue(int[] arr){
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        Set<Integer> set = new HashSet<>(list);
        return set.size() != list.size();

    }
}
