package com.com.day2.bootcamp;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by akhil on 16/3/17.
 */

//Write a method that takes a string and print the number of occurrence of each character characters in the string.

public class Q3 extends Q2 {
    @Override
    void dispMap(Map<Character,Integer> m) {
        int count=0;
        for (Map.Entry<Character, Integer> e : m.entrySet()) {
            System.out.println(" Character "+e.getKey()+" occured "+ e.getValue()+" times");
        }
    }
    public static void main(String[] args) {
        Q3 ob= new Q3();
        String string;
        string=sc.next();
        ob.getUniqueChars(string);
    }
}
