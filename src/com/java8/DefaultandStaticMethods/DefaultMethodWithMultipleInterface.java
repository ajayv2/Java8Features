package com.java8.DefaultandStaticMethods;

interface Left{
    default void method1(){
        System.out.println("interface left method");
    }
}
interface Right{
    default void method1(){
        System.out.println("interface right method");
    }
}
public class DefaultMethodWithMultipleInterface implements Left,Right {
    public void method1(){
        Left.super.method1();
    }

    public static void main(String[] args) {
        DefaultMethodWithMultipleInterface d = new DefaultMethodWithMultipleInterface();
        d.method1();
    }
}
