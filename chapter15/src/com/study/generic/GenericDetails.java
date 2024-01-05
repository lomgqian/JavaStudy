package com.study.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2023/11/19 1:12
 */
public class GenericDetails {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        //List<int> list = new ArrayList<int>();
        //指向数据类型只能是应用类型，不能是基本数据类型
        //代码略
        //在给泛型传入具体类型后，可以传入该类型的子类型

        //3.泛型的使用形式
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //可以简写
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        //泛型默认是Object类型
        ArrayList list1 = new ArrayList();
        //等价于
        ArrayList<Object> list2 = new ArrayList<>();//E是一种标识符，代表数据类型
    }
}
