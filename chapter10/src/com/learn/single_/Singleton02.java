package com.learn.single_;

public class Singleton02 {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        System.out.println(cat);
        System.out.println(Cat.n1);
    }
}
class Cat{
    private String name;
    public static int n1=99;
    private static Cat cat;

    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static Cat getInstance(){
        if(cat==null){cat=new Cat("jack");}
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}