package com.learn.interface_;

public class interface01 {
    public static void main(String[] args) {
        Camera camera = new Camera();
        phone phone = new phone();
        Computer computer = new Computer();
        computer.work(phone);
        System.out.println("-----------------");
        computer.work(camera);
    }
}

