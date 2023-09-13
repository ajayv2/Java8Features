package com.java8.streamapi;

import java.util.Scanner;
import java.util.stream.IntStream;

//program to check a number is prime or not in java8
public class Program3 {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime = isPrime(num);
        if (prime){
            System.out.println("yes prime");
        }else{
            System.out.println("Not prime");
        }
    }
    public static boolean isPrime(int num){
        return num>1 && IntStream.range(2,num).noneMatch(n->num%n==0);
    }
}
