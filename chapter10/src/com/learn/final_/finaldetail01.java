package com.learn.final_;

public class finaldetail01 {
    public static void main(String[] args) {
        EE ee = new EE();
        ee.n1();
    }
}
class AA{
    public final double TAX_RATE=0.01;//final修饰的是常量
    public final double TAX_RATE2;//可在构造器或代码块中定义
    public final double TAX_RATE3;
    public AA(){
        TAX_RATE2=0.02;
    }
    {
        TAX_RATE3=0.03;
    }
}
class BB{
    //如果final修饰的属性是静态的则初始化的位置只能是1.定义时2.在静态代码块
    //不能在构造器中
    public static final double TAX_RATE4=0.04;
    public static final double TAX_RATE5;
    static {
        TAX_RATE5=0.05;
    }
}
//final类不能继承，但能实例化对象
class CC{ }
class DD{//类不是final类，但含有final方法，则方法不能被重写但能被继承
    public final void n1(){
        System.out.println("n1.......");
    }
}
class EE extends DD{}