package com.learn.interface_;

public class MysqlDB implements DBinterface {
    public void connect(){
        System.out.println("连接到Mysql");
    }
    public void close(){
        System.out.println("和Mysql断开连接");
    }
}
