package com.Study.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2023/8/15 13:07
 */
@SuppressWarnings({"all"})
public class ArrayListDetail {
    public static void main(String[] args) {
        //ArrayList是线程不安全的，
        //可添加各种元素，包括空值

        List list=new ArrayList();
        list.add("jack");
        list.add(null);

    }
}
