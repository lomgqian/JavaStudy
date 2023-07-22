package com.learn.final_;

public class finaldetail02 {
    public static void main(String[] args) {
        System.out.println(AAA.aaa);
    }
}
class AAA
{
    public final static int aaa=5;
    static {
        System.out.println("静态代码块被加载了");
    }
}
//包装类都是final类