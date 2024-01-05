package com.Study.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @date 2023/8/27 12:04
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack",18));
        hashSet.add(new Employee("tom",20));
        hashSet.add(new Employee("lance",18));
        hashSet.add(new Employee("jack",18));
        System.out.println("hashset="+hashSet);
    }
}
class Employee{
    private String name;
    private  int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)return true;
        if (obj==null||getClass()!=obj.getClass())return false;
        Employee employee=(Employee) obj;
        return age==employee.age&&
                Objects.equals(name,employee.name);}
    @Override
    public int hashCode(){
        return Objects.hash(name,age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}