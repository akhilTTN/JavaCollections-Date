package com.com.day2.bootcamp;

import b.a.Q;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by akhil on 16/3/17.
 */

//  Write a method that takes a string and returns the number of unique characters in the string.

public class Q2 {
    static Scanner sc=new Scanner(System.in);

    void getUniqueChars(String string) {
        int values;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++)
            if (map.containsKey(string.charAt(i))) {
                values = map.get(string.charAt(i));
                map.put(string.charAt(i), ++values);
            } else {
                map.put(string.charAt(i), 1);
            }
            dispMap(map);
    }

    void dispMap(Map <Character,Integer>m) {
        int count=0;
        for (Map.Entry<Character, Integer> e : m.entrySet()) {
            if(e.getValue()==1) {
                System.out.print(e.getKey()+" ");
                count++;
            }
        }
        System.out.println("Total no of unique characters are "+count);
    }

    public static void main(String[] args) {
        Q2 ob= new Q2();
        String string;
        string=sc.next();
        ob.getUniqueChars(string);
    }
}
