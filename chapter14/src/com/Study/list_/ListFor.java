package com.Study.list_;

import java.util.*;

/**
 * @date 2023/8/15 9:45
 */
public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//List list=new ArrayList();
       // List list=new Vector();//也可行
        List list=new LinkedList();//也可行
list.add("jack");
list.add("tom");
list.add(666);
list.add(false);
list.add("真的假的");



//遍历
//1.迭代器
        System.out.println("------------------迭代器------------------");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }


        System.out.println("----------------增强for---------------------");
        //2.增强for  快捷键是大写的I
        for (Object o :list) {
            System.out.println("o="+o);
        }
        System.out.println("---------------普通for循环-------------");
//3.普通for循环  快捷键fori
        for (int i = 0; i <list.size() ; i++) {
            System.out.println("对象为"+list.get(i));
        }

    }
}
