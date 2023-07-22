package com.homework.一;

public class worker {
    private String name;
    private double salary;
    private int days;
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public worker(String name, double salary, int days, double grade) {
        this.name = name;
        this.salary = salary;
        this.days = days;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public void money(){

        System.out.println("员工"+name+"单日工资"+salary+"天数"+days+"薪水"+salary*days*grade);

    }
}
