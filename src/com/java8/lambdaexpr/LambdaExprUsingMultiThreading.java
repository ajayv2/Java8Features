package com.java8.lambdaexpr;

public class LambdaExprUsingMultiThreading {
    public static void main(String[] args) {
        Runnable r = ()->{
            for(int i=0;i<10;i++){
                System.out.println("Child thred");
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
