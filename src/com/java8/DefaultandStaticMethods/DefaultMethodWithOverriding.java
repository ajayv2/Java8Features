package com.java8.DefaultandStaticMethods;

interface Interf1{
    default void defaultMethods(){
        System.out.println("default method implementation");
    }
}
public class DefaultMethodWithOverriding implements Interf1 {
    public void defaultMethods(){
        System.out.println("Our own implementation of default methods");
    }
    public static void main(String[] args) {
        DefaultMethodWithOverriding d = new DefaultMethodWithOverriding();
        d.defaultMethods();
    }
}
