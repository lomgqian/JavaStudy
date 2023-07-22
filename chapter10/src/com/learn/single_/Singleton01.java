package com.learn.single_;

public class Singleton01 {
    public static void main(String[] args) {
        Girlfriend girlfriend = Girlfriend.getname();
        System.out.println(girlfriend);
    }
}
//单例模式-饿汉式
//1.将构造器私有化
//2.在类的内部直接创造对象（static）
//3.提供一个公共的static方法，返回gf对象
class Girlfriend{
    private  String name;
    private static Girlfriend gf=new Girlfriend("miku");
    private Girlfriend(String name) {
        this.name = name;
    }
    public static Girlfriend getname(){
        return gf;
    }

    @Override
    public String toString() {
        return
                "name=" + name ;
    }
}
