package com.Study.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @date 2023/8/28 10:41
 */
public class LinkHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("ddd",1000000));
        linkedHashSet.add(new Car("wdd",9000000));
        linkedHashSet.add(new Car("dfd",3000000));
        linkedHashSet.add(new Car("myy",5000000));
        linkedHashSet.add(new Car("dgr",7000000));
        System.out.println(linkedHashSet);
    }
}
class Car{
    private  String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override//快捷键alt+ins
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}