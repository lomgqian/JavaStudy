package com.learn.Innerclass;

public class LocalInnerclass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.hi();
    }
}
class Outer01{
    private int n1=10;
    public void hJ(){}
    public void hi(){//局部内部类定义在外部类的局部位置，通常在方法
        class Inner02{//作用域仅仅在定义他的方法或代码块中
            String name="XXX";
            public void f1(){
                System.out.println(n1);
                hJ();//可以直接访问外部类的所有成员
}
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }

    {//代码块
        class inner03{}
    }
}
