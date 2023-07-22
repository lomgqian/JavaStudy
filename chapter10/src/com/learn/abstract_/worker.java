package com.learn.abstract_;

public class worker extends Employee{
    public worker(String name, int id, double salary) {
        super(name, id, salary);
    }
    public void work(){
        System.out.println("员工"+getName()+"工作中");
    }
}
