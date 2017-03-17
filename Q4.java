package com.com.day2.bootcamp;

import b.a.E;

import java.util.*;

/**
 * Created by akhil on 16/3/17.
 */

//Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

class Employee{
    String name;
    String empId;
    double age;
    double salary;

    public Employee(String name, String empId, double age, double salary) {
        this.name = name;
        this.empId = empId;
        this.age = age;
        this.salary = salary;
    }
}

class Age_Comparator implements Comparator{

    @Override
    public int compare(Object o, Object t1) {
        Employee e=(Employee)o;
        Employee e1=(Employee)t1;

        if(e.salary<e1.salary)
            return -1;
        else if(e.salary>e1.salary)
            return 1;
        else
            return 0;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Employee emp1=new Employee("Akhil","Akh123",24,15100.00);
        Employee emp2=new Employee("Robin","Rob123",27,15000.00);
        Employee emp3=new Employee("Nitin","Nit123",24,30000.00);
        List<Employee> list=new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        Collections.sort(list, new Age_Comparator());
        for(Employee l:list){
            System.out.println(l.name +" gets "+l.salary+" per month");
        }

    }
}
