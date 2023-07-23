package com.study.Homework;

/**
 * @date 2023/7/23 15:34
 */
public class homework03 {
    public static void main(String[] args) {
        Animal cat = new cat();
        Animal dog=new dog();
        cat.shout();
        dog.shout();
    }
}
 abstract class Animal{
    public abstract void shout();
}
class dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}
class cat extends Animal{
    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}