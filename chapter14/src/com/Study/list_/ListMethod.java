package com.Study.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2023/8/13 11:01
 */
public class ListMethod {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("张三丰");
        list.add("fff");
        list.add("fffff");
        list.add("test");
        list.add(1,"ddd");//在index=1的位置插入一个对象
        System.out.println("list="+list);
        System.out.println(list.indexOf("test"));//返回元素在当前集合中首次出现的位置
        list.add("aaa");
        System.out.println(list.lastIndexOf("aaa"));//返回元素在当前集合中最后出现的位置
        list.remove(0);//移除
        list.set(3,"marry");//替换
        System.out.println(list);
    }
}
