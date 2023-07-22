package com.learn.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class aniaml{//类中存在抽象方法时，就必需设为抽象类
    private String name;

    public aniaml(String name) {
        this.name = name;
    }
//    public void eat(){//抽象方法就是没有实现的方法
//        System.out.println("eating......");
//    }
    public abstract   void eat();
}
