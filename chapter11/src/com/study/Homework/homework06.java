package com.study.Homework;

/**
 * @date 2023/7/23 16:25
 */
public class homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧",new Horse());
        tang.common();
        tang.River();
    }
}
interface Vehicles{
    public void work();
}
class Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("使用马");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("使用船前进");
    }
}
class Plane implements Vehicles{
    @Override
    public void work() {
        System.out.println("乌鸦坐飞机");
    }
}
class VehiclesFactory{
    public VehiclesFactory() {
    }

    private static Horse horse=new Horse();
    public static Horse gethorse(){
       // return new Horse();
        return horse;
    }
    public static Boat getboat(){
        return new Boat();
    }
    public static Plane getplane(){
        return new Plane();
    }
}
class Person{
private String name;
private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void River(){
        /*Boat boat = VehiclesFactory.getboat();
        boat.work();*/
        if(!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getboat();
        }

        vehicles.work();
    }
    public void common(){
        //if(vehicles==null){
        if(!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.gethorse();
        }

        vehicles.work();
    }
    public void fire(){
        //if(vehicles==null){
        if(!(vehicles instanceof Plane)){
            vehicles = VehiclesFactory.getplane();
        }

        vehicles.work();
    }
}