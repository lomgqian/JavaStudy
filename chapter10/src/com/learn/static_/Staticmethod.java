package com.learn.static_;

public class Staticmethod {
    public static void main(String[] args) {
        Stu jack = new Stu("jack");
        jack.addfee(100);
        Stu tom = new Stu("tom");
        tom.addfee(200);
        Stu.totalfee();
    }
}
class Stu{
    public String name;
    public static int fee;

    public Stu(String name) {
        this.name = name;
    }

    public static void addfee(double fee){
        Stu.fee+=fee;
    }
    public static void totalfee(){
        System.out.println("总学费是:"+fee);
    }
}
