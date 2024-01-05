package com.Study.map_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @date 2023/10/27 22:47
 */
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1,new Emp("yjj",30000,1));
        hashMap.put(2,new Emp("ddd",12000,2));
        hashMap.put(3,new Emp("aaa",50000,3));
        Set keySet=hashMap.keySet();
        for (Object key :keySet) {
            Emp emp=(Emp) hashMap.get(key);
            if (emp.getSal()>18000){
                System.out.println(emp);
            }
        }

    }
}

class Emp{
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}