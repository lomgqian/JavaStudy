package com.Study.Date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @date 2023/7/31 11:12
 */
public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("年="+localDateTime.getYear());
        System.out.println("月="+localDateTime.getMonth());
        System.out.println("月="+localDateTime.getMonthValue());
        System.out.println("日="+localDateTime.getDayOfMonth());
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年M月Mdd日 hh小时mm分钟ss秒");
        String format=dateTimeFormatter.format(localDateTime);
        System.out.println("格式化的日期"+format);
    }
}
