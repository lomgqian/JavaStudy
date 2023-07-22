package com.learn.interface_;

public class Camera implements USBinterface{
    public void start(){
        System.out.println("相机开始工作。。。。。");
    }
    public void end(){
        System.out.println("相机停止工作。。。。。");
    }
}
