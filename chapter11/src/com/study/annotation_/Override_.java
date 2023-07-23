package com.study.annotation_;

/**
 * @date 2023/7/23 9:36
 */
public class Override_ {
    public static void main(String[] args) {

    }
}
class father{
    public void fly(){
        System.out.println("fly.........");
    }
}

class son extends father{
    @Override//表示子类重写了父类方法//不写也还是重写了父类
    //如果写了Override，编译器会去检查是否真的重写了父类方法
    //只能修饰方法
    public void fly(){
        System.out.println("son fly.........");
    }
}
