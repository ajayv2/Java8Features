package com.java8.DefaultandStaticMethods;

interface Interf4{
    public static void m1(){
        System.out.println("Interface static method");
    }
}
public class StaticMethodExample {
    public static void main(String[] args) {
        Interf4.m1();
    }
}
