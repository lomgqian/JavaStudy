package com.study.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @date 2023/7/25 16:35
 */
public class throw01 {
    public static void main(String[] args) {

    }
    public void f1()throws FileNotFoundException {
        FileInputStream res=new FileInputStream("d://aa.txt");
    }
}
