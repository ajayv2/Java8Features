package com.java8.predefinedFI.Consumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class BiConsumerDemo {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();
        populate(l);
        BiConsumer<Employee,Double> c = (e,d)->e.salary +=d;
        for(Employee e:l){
            c.accept(e,500.0);
        }
        for(Employee e:l){
            System.out.println(e);
        }
    }
    public static void populate(ArrayList<Employee> l){
        l.add(new Employee("Emp1",1000));
        l.add(new Employee("Emp2",1500));
        l.add(new Employee("Emp3",2000));
    }
}
