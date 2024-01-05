package com.Study.set_;

import java.util.HashSet;

/**
 * @date 2023/8/20 15:47
 */
public class HashSet_ {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("yjjj"));
        System.out.println(set.add("8888"));
        System.out.println(set.add("who?"));
        System.out.println(set.add("what"));
        set.remove("yjjj");
        System.out.println("set="+set);
        set = new HashSet();
        set.add("yjj");//ok
        set.add("yjj");//不ok
        set.add(new Dog("tom"));//ok
        set.add(new Dog("tom"));//ok
        set.add(new String("okk"));//ok
        set.add(new String("okk"));//ok不了一点
        System.out.println("set="+set);

    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}