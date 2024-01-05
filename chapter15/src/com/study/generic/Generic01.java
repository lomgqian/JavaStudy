package com.study.generic;

import java.util.ArrayList;

/**
 * @date 2023/11/1 15:36
 */
public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("ys",20));//添加的是object
        arrayList.add(new Dog("xyj",20));
        for (Object o :arrayList) {
            Dog dog=(Dog) o;//向下转型，Object——》dog
            System.out.println(dog.getName()+dog.getAge());
        }

    }
}
class Dog{
    public  String name;
    public  int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class Cat{
    public  String name;
    public  int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}