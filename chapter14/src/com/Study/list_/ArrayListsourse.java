package com.Study.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2023/8/15 13:19
 */
public class ArrayListsourse {
    public static void main(String[] args) {
//扩容机制
        //创建ArrayList对象时，如果使用的是无参构造器，则初始elementDate的容量为0，
        //第一次添加扩容为10，然后不断1.5倍，如15，22，33。。。。。。
        //使用copyof产生新数组
        //List list=new ArrayList();
        List list=new ArrayList(8);
        //创建ArrayList对象时，如果使用的是有参构造器，则初始elementDate的容量为指定大小，
        //若扩容，则直接为1.5倍
        for (int i = 0; i <= 10; i++) {
list.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
