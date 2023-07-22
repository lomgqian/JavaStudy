package com.learn.Innerclass;

public class AnonymousLnnerClass {
    public static void main(String[] args) {
        Father father = new Father(){
            public void h1(){
                System.out.println("222222");
            }
        };
    }
}
//有基于类和接口的匿名内部类

class Father{
    public void h1(){
        System.out.println("111111");
    }

}