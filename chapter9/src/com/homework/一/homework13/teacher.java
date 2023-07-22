package com.homework.一.homework13;

public class teacher extends Person {
    private int work_age;

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }
    public void teacch(){
        System.out.println("我承诺，要好好教书");
    }
    @Override
    public String play() {
        return super.play()+"象棋";
    }
    public void printinfo(){
        System.out.println("老师的信息是:");
        System.out.println(basisinfo());
        System.out.println("工龄是"+this.getWork_age());
        teacch();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "teacher{" +
                "work_age=" + work_age +
                '}'+super.toString();
    }
}
