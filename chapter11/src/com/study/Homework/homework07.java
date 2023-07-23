package com.study.Homework;

/**
 * @date 2023/7/23 20:44
 */
public class homework07 {
    public static void main(String[] args) {
        Car car = new Car(32);
        car.getair().flow();
    }
}
class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class air{
        public void flow(){
            if(temperature>40){
                System.out.println("吹冷气");
            }else if(temperature<0){
                System.out.println("吹热气");
            }else {
                System.out.println("温度正常");
            }
        }
    }public air getair(){
        return new air();
    }
}
