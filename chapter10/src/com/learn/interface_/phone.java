package com.learn.interface_;

public class phone implements USBinterface{
    public void start(){
        System.out.println("手机开始工作。。。。。");
    }
    public void end(){
        System.out.println("手机停止工作。。。。。");
    }
}