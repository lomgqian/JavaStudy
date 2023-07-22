package com.learn.interface_;

public class interfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.ni);
    }
}
interface IB{
  int ni=10;//等价于public static final int ni=10;
    void a();
}
interface IC{
    void b();
}
class C implements IB,IC{

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
interface ID extends IB,IC{}////接口不能继承类，但是可以继承多个别的接口

