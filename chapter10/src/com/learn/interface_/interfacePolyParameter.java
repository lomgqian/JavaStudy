package com.learn.interface_;

public class interfacePolyParameter {
    public static void main(String[] args) {
//        IF if=new Monster();
//        if=new Car();

AAA a=new BBB();
a=new CCC();
    }
}
interface  IF{ }
class Monster implements IF{}
class Car implements IF{}
class AAA{}
class BBB extends AAA{}
class CCC extends AAA{}