package com.learn.interface_;

public class ExtendsVSinterface {
    public static void main(String[] args) {
        littleMonkey wukong = new littleMonkey("wukong");
        wukong.climb();
    }
}
interface fishable{
    void swimming();
}
class Monkey{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monkey(String name) {
        this.name = name;
    }
    public void climb(){
        System.out.println(name+"会爬树。。。");
    }
}
class littleMonkey extends Monkey implements fishable{
    public littleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"会像鱼一样游泳。。。");
    }
}
