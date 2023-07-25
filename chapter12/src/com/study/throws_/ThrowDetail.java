package com.study.throws_;

/**
 * @date 2023/7/25 16:41
 */
public class ThrowDetail {
    public static void main(String[] args) {

    }
}
class Father{
    public void method()throws NullPointerException{}}
class Son extends Father{
    public void method()throws NullPointerException{}//子类抛出的异常要么与父类一致，要么为父类异常异常的子类
}
//运行异常并不需要显示处理，编译异常则需要