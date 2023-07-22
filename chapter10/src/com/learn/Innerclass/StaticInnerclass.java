package com.learn.Innerclass;

public class StaticInnerclass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m10();
        //外部其他类，使用静态内部类
        //方式一
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.hi();//因为静态内部类是可以通过类名直接访问（前提是满足访问权限）
        //方式二
        //编写一个方法，可以返回静态内部类的对象实例
        Outer10.Inner10 inner101 = outer10.getInner10();
        inner101.hi();
        System.out.println("----------------------------");
        Outer10.Inner10 inner102 = Outer10.getInner10_();
        inner102.hi();
        System.out.println("****************************");

    }
}//静态内部类和成员内部类一样，都是定义在外部类的成员位置。有static修饰
class Outer10{
    private int n1=10;
    public static String name="jack";
    public static void cry(){
        System.out.println("......");
    }
    static class Inner10{
        public static String name="ddd";
public void hi(){
    System.out.println(name);//可以直接访问外部类的所有静态成员，包含私有的
}
    }
    public void m10(){
        Inner10 inner10 = new Inner10();
        inner10.hi();
    }
    public Inner10 getInner10(){
        return new Inner10();
    }
    public  static Inner10 getInner10_(){
        return new Inner10();
    }
}
