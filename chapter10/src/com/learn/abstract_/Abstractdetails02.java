package com.learn.abstract_;

public class Abstractdetails02 {
    public static void main(String[] args) {

    }
}
 abstract class D{//抽象类的本质还是类，所以有类的各种成员
    public String name="jack";
    public static int n1=99;
    public void n2(){
        System.out.println("111");
    }
    public static void n3(){
        System.out.println("222");
    }
    static {
        System.out.println("3333");
    }
     {
         System.out.println("4444");
     }

     public D(String name) {
         this.name = name;
     }
     public abstract void n4();
 }
abstract class E{
    public abstract void n5();
}
class F extends E{
    public void n5(){
        System.out.println("5555");
    }
}