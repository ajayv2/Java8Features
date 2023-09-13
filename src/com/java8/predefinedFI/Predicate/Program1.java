package com.java8.predefinedFI.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Program1 {
    public static void main(String[] args) {
        //predicate to test no is even or odd
        Predicate<Integer> p1=i->i%2==0;
        System.out.println(p1.test(10));
        System.out.println(p1.test(15));
        ArrayList<Employee> l = new ArrayList<>();
        Employee e = new Employee("Peter",1234);
        Employee e1 = new Employee("Peter",1294);
        Employee e2 = new Employee("Peter",984);
        Employee e3 = new Employee("Peter",728);
        l.add(e);
        l.add(e1);
        l.add(e2);
        l.add(e3);
        Predicate<Employee> p2 = emp->emp.salary>1000;
        for(Employee empp:l){
            if(p2.test(empp)){
                System.out.println(empp);
            }
        }
    }
}
