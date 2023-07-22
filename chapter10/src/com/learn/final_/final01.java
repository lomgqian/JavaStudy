package com.learn.final_;

public class final01 {
    public static void main(String[] args) {
        C c = new C();
        //System.out.println(c.n2());
    }
}
final class A{
    public  void n1(){
        System.out.println("如果不希望某个类被继承，可以使用final修饰");
    }
}
//class B extends A{ }
class C{
    public final void n2(){
        System.out.println("不希望某个方法被调用，可以用final修饰");
    }
}
class D{
    //不希望类的的某个属性被修改
    public double TAX_RATE=0.09;
}
class E{
    public void n3(){
        final double NUM=0.02;
        //NUM=0.09;不希望某个局部变量被修改
        System.out.println(NUM);
    }
}