package com.study.Homework;

/**
 * @date 2023/7/23 11:32
 */
public class homework02 {
    public static void main(String[] args) {
    }
}
class Frock{
    private static int currentNum=100000;

    public int getSerialNumber() {
        return SerialNumber;
    }

    private  int SerialNumber;

    public Frock() {
        SerialNumber = Frock.getNextNum();
    }

    public static  int getNextNum(){
        currentNum+=100;
        return currentNum;
    }
}
class TestFrock{
    public static void main(String[] args) {
        Frock frock = new Frock();
        Frock frock2 = new Frock();
        Frock frock3= new Frock();
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        System.out.println(frock.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());
    }
}