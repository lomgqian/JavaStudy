package com.Study.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @date 2023/8/18 16:50
 */
public class SetMethod_ {
    public static void main(String[] args) {
        //不能存放重复的数据。可以添加一个NULL
        Set set = new HashSet();
        set.add("yjj");
        set.add("ok");
        set.add("ddd");
        set.add(null);
        for (int i = 0; i <6 ; i++) {
            System.out.println("set="+set);
        }//普通for循环无效
        System.out.println("------------------使用迭代器------------");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("obj="+next);
        }
        System.out.println("------------------使用迭代器------------");
        for (Object o :set) {
            System.out.println("o="+o);
        }

    }
}
