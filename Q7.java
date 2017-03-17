package com.com.day2.bootcamp;

import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by akhil on 16/3/17.
 */

//Write a program to format date as example "21-March-2016"

public class Q7 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.println(new SimpleDateFormat("dd-MMMM-YYYY").format(cal.getTime()));
    }
}
