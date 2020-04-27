package com.girish.creationaldesignpattern.factory;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
