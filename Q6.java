package com.com.day2.bootcamp;

import java.util.*;

/**
 * Created by akhil on 16/3/17.
 */

//Print the elements of an array in the decreasing frequency if 2 numbers have same frequency
// then print the one which came first.

    class KeyValueComparator implements Comparator{
        Map map;

    public KeyValueComparator(Map map) {
        this.map = map;
    }

    @Override
    public int compare(Object o, Object t1) {
       Integer i1=(Integer)map.get((String) o);
       Integer i2=(Integer)map.get((String)t1);
        if(i1>i2)
            return 1;
        else if(i1<i2)
            return -1;
        else
            return 1;
    }
}
public class Q6 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, Integer> map=new LinkedHashMap<>();
        int size;
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        System.out.println("Enter the characters in the array ");
        String []array=new String[size];
        int val=0;
        for(int i=0;i<size;i++){
            array[i]=sc.next();
            if(map.containsKey(array[i])){
                val=map.get(array[i]);
                map.put(array[i],++val);
            }
            else
                map.put(array[i],1);
        }
        ArrayList<String> keylist=new ArrayList<>();
        ArrayList<Integer> vallist=new ArrayList<>();
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            keylist.add(entry.getKey());
            vallist.add(entry.getValue());
        }
        Comparator c=new KeyValueComparator(map);
        TreeMap<String,Integer> treeMap=new TreeMap(c);
        treeMap.putAll(map);

        for(Map.Entry<String,Integer> entry:treeMap.entrySet()){
            System.out.println(entry.getKey()+" has "+entry.getValue()+" value");
        }

        System.out.println(treeMap);


    }
}
