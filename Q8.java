package com.com.day2.bootcamp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by akhil on 17/3/17.
 */

//Write a program to display times in different country format.

public class Q8 {
    public static void main(String[] args) {
        Date d = new Date();
        Locale list[] = DateFormat.getAvailableLocales();
        for (Locale aLocale : list) {
            System.out.println(DateFormat.getDateInstance(DateFormat.FULL,aLocale).format(d));
        }
    }
}
