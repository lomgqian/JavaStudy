package com.study.Homework;

/**
 * @date 2023/7/23 16:08
 */
public class homework05 {
    public static void main(String[] args) {
new A().n1();

    }
}
class A{
    private  String NAME="test";
    public void n1(){
        class B{
            private final String NAME="yjj";
            public void show(){
                System.out.println("NAME为"+NAME+"外部类的name"+A.this.NAME);
            }
        }
       B b=new B();
        b.show();

    }
}