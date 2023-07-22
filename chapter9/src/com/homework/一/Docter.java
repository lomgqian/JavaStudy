package com.homework.一;

public class Docter {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;
    //构造器(盲打好烦)

    public Docter(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    //重写object方法
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Docter)){
            return false;
        }
        Docter docter=(Docter)obj;
        return this.name.equals(docter.name)&&this.age==docter.age&&this.job.equals(docter.job)
                &&this.gender==docter.gender&&this.sal==docter.sal;
    }
}
