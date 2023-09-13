package com.java8.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner st = new StringJoiner(",");

        System.out.println(st);
        st.setEmptyValue("It is empty");
        System.out.println(st);
        st.add("Java");
        st.add("Python");
        System.out.println(st);
        System.out.println("length is "+st.length());

    }
}
