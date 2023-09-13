package com.java8.DefaultandStaticMethods;

interface Interf{
    public default void defaultMethod(){
        System.out.println("Default methods");
    }
}
public class DefaultMethodExp implements Interf {
//    public void defaultMethod(){
//        System.out.println("Our own implementation of default method");
//    }
    public static void main(String[] args) {
        DefaultMethodExp d = new DefaultMethodExp();
        d.defaultMethod();
    }
}
