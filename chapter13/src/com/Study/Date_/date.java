package com.Study.Date_;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date 2023/7/31 10:45
 */
public class date {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);//默认输出的格式是国外的，要更改
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年M月Mdd日 hh:mm:ss E");//格式规定好的，不能更改
String format=sdf.format(date1);
        System.out.println(format);

    }
}
