package com.Study.list_;

import java.util.Vector;

/**
 * @date 2023/8/16 16:31
 */
public class Vector_ {
    @SuppressWarnings({"all"})
    //与arraylist差不多，只是提升倍数是两倍而不是1.5
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
           vector.add(i);
        }
        vector.add(100);
        System.out.println(vector);
    }
}
