package com.Study.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @date 2023/8/13 11:16
 */
public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
List list=new ArrayList();
        for (int i = 0; i < 12; i++) {//快捷键fori
list.add("hallo"+i);
        }
        System.out.println("list="+list);
        list.add(1,"尊渡假赌");
        System.out.println("list="+list);
        System.out.println("第五个元素"+list.get(4));
        list.remove(5);
        System.out.println("list="+list);
        list.set(6,"三国");
        System.out.println("list="+list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }


    }
}
