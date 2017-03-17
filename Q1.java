package com.com.day2.bootcamp;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by akhil on 16/3/17.
 */

//Write Java code to define List . Insert 5 floating point numbers in List,
// and using an iterator, find the sum of the numbers in List.

public class Q1 {
    public static void main(String[] args) {
        double sum=0.0;
        List <Double> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter floating point values in the list till you enter -1");
        double d=sc.nextDouble();
        while(d!=-1){
            list.add(d);
            d=sc.nextDouble();
        }

        ListIterator<Double> itr= list.listIterator();
        while(itr.hasNext()){
            sum+=itr.next();
        }
        System.out.println("sum of the elements of the list is "+sum);

    }
}
