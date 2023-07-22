package com.homework.一;

public class homework10 {
    public static void main(String[] args) {
        Docter docter1 = new Docter("jack", 20, "docter", '男', 20000);
        Docter docter2 = new Docter("jack", 20, "docter", '男', 20000);
        System.out.println(docter1.equals(docter2));
    }
}
