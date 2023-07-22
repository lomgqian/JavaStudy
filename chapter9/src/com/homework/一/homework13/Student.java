package com.homework.一.homework13;

public class Student extends Person{
    private String stu_id;

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }
public void study(){
    System.out.println("我承诺，要好好学习");
}

    @Override
    public String play() {
       return super.play()+"足球";
    }
    public void printinfo(){
        System.out.println("学生的信息是:");
        System.out.println(basisinfo());
        System.out.println("学号是"+this.getStu_id());
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}'+super.toString();
    }
}
