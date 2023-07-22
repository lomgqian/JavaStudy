package com.learn.interface_;

public class OracleDB implements DBinterface {
    public void connect(){
        System.out.println("连接到Oracle");
    }
    public void close(){
        System.out.println("和Oracle断开连接");
    }
}
