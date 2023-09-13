package com.java8.predefinedFI.Function;

import java.util.EnumMap;
import java.util.function.BiFunction;

class Employee
{
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class BiFunctionExp {
    public static void main(String[] args) {
        BiFunction<String,Integer, Employee> f = Employee::new;
        Employee e = f.apply("Ajay",29);
        System.out.println(e);
    }
}
