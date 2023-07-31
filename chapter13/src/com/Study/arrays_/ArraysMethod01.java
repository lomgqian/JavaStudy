package com.Study.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @date 2023/7/30 9:35
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integer={1,23,45};
        System.out.println(Arrays.toString(integer));
        Integer arr[]={12,34,56};
        Arrays.sort(arr);
        System.out.println("排序以后");
        System.out.println(Arrays.toString(arr));
        //定制排序
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer i1=(Integer) o1;
                Integer i2=(Integer) o1;
                return i2-i1;
            }
        });
    }
}
