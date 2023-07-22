package com.learn.Innerclass;

public class Innerclass01 {
    public static void main(String[] args) {

    }
}
class Outer{
    private int n1=10;//属性
    public void hi(){//方法
        System.out.println("hi");
    }
    public Outer(int n1) {//构造器
        this.n1 = n1;
    }
    {//代码块
        System.out.println("代码块");
    }
    class Inner{//内部类

    }
}
