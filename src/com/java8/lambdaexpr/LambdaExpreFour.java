package com.java8.lambdaexpr;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
    String name;
    int eno;
    Employee(String name,int eno){
        this.name = name;
        this.eno = eno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eno=" + eno +
                '}';
    }
}
public class LambdaExpreFour {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();
        l.add(new Employee("Ronny",872425));
        l.add(new Employee("Sunny",212325));
        l.add(new Employee("Bunny",112133));
        l.add(new Employee("Chinny",434343));
        System.out.println(l);
        //sorting based on employee no
        Collections.sort(l,(e1,e2)-> Integer.compare(e1.eno, e2.eno));
        System.out.println("Employee based on ascending order of eno");
        System.out.println(l);
        System.out.println("Employee sorting based on alphabetical order of his name");
        Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
        System.out.println(l);

    }
}
