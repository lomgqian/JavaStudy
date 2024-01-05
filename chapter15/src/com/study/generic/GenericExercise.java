package com.study.generic;

import java.util.*;

/**
 * @date 2023/11/19 0:57
 */
public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("yjj",21));
        students.add(new Student("tom",18));
        students.add(new Student("jack",29));
        for (Student student :students) {
            System.out.println(student);
        }
//使用HashMap
        HashMap<String, Student> hashMap = new HashMap<String, Student>();
        hashMap.put("yjj",new Student("yjj",21));
        hashMap.put("tom",new Student("tom",18));
        hashMap.put("jack",new Student("jack",23));
        Set<Map.Entry<String, Student>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey()+next.getValue());
        }
    }
}
class Student{
    private String name;
    private  int age;

    public Student(String name, int age) {
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
}