package com.com.day2.bootcamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by akhil on 16/3/17.
 */

//Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age

class Student{
    String FirstName;
    double score;
    double age;

    public Student(String firstName, double score, double age) {
        FirstName = firstName;
        this.score = score;
        this.age = age;
    }
}
class Score_And_Name_comaparator implements Comparator{

    @Override
    public int compare(Object o, Object t1) {
        Student s=(Student)o;
        Student s1=(Student)t1;

        if(s.score<s1.score)
            return -1;
        else if(s.score > s1.score)
            return 1;
        else if(s.score==s1.score)
        {
            if(s.FirstName.compareTo(s1.FirstName)<1)
                return -1;
            else if(s.FirstName.compareTo(s1.FirstName)>1)
                return 1;
            else
                return 0;
        }
        return 0;
    }
}
public class Q5 {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Robin",70,24));
        list.add(new Student("Akhil",70,24));
        list.add(new Student("Nitin",100,24));
        Collections.sort(list, new Score_And_Name_comaparator());
        for(Student s:list)
            System.out.println(s.FirstName+" scored "+s.score+" marks and is "+s.age+" years old");
    }
}
