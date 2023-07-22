package com.learn.interface_;

public class interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
    }
    public static void t(DBinterface dBinterface){//static关键字的用途
        // 一句话描述就是：方便在没有创建对象的情况下进行调用(方法/变量)。
        dBinterface.connect();
        dBinterface.close();
    }
}
