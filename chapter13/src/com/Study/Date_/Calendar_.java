package com.Study.Date_;

import java.util.Calendar;

/**
 * @date 2023/7/31 11:00
 */
public class Calendar_ {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar="+calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //等等还有一大串的功能
    }
}
