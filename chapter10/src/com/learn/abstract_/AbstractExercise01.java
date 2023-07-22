package com.learn.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 01001, 50000);
        jack.setBonus(60000);
        jack.work();
        worker tom = new worker("tom", 1002, 6000);
        tom.work();

    }
}

