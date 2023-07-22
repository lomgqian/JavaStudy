package com.learn.CodeBlock_;

public class codeblock01 {
    public static void main(String[] args) {
        Moive ssss = new Moive("ssss");
        Moive moive = new Moive("ssss", 100,"雨宫哲");
    }
}
class Moive{
    private String name;
    private int price;
    private String dirextor;
    {
        System.out.println("这一坨是代码块");
        System.out.println("test");
    }

    public Moive(String name) {
        this.name = name;
        System.out.println("构造器Moive(String name)被调用");
    }

    public Moive(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("构造器Moive(String name, int price)被调用");
    }

    public Moive(String name, int price, String dirextor) {
        this.name = name;
        this.price = price;
        this.dirextor = dirextor;
        System.out.println("构造器Moive(String name, int price, String dirextor)被调用");
    }
}
