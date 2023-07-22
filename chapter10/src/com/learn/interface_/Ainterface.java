package com.learn.interface_;

public interface Ainterface {
    public int n1=11;
    public void hi();
    default public void ok(){//jdk8.0后可以实现默认方法
        System.out.println("ok!");
    }
     public static void cry(){//jdk8.0后可以实现默认方法
        System.out.println("cry.......");
    }
}
