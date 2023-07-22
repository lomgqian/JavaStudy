package com.learn.final_;

public class finalexercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.S());

    }
}
class Circle{
    private double radius;
    private final double PI=3.14;

    public double S(){
        return radius*radius*PI;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
