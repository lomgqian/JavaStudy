package com.homework.一;

public class superworker extends worker {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public superworker(String name, double salary, int days, double grade) {
        super(name, salary, days, grade);
    }

    @Override
    public void money() {
        System.out.println("高级社畜");
        System.out.println("经理"+getName()+"工资是"+(getBonus()+getDays()*getGrade()*getSalary()));
    }
}
