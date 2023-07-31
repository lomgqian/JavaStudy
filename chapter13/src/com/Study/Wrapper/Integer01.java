package com.Study.Wrapper;

/**
 * @date 2023/7/26 16:36
 */
public class Integer01 {
    public static void main(String[] args) {
int n1=100;
//手动装箱  int------》Integer
Integer integer=new Integer(n1);
        Integer integer1=Integer.valueOf(n1);
        int i=integer.intValue();

    }
}
