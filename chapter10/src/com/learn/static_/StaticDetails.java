package com.learn.static_;

public class StaticDetails {
    public static void main(String[] args) {
        System.out.println(B.b1);
        System.out.println(C.c1);
    }
}
class B{
    public static int b1=10;
    public int b2=20;
}

class C{
    public static String c1="address";
}