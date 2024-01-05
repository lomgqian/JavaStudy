package com.study.customgeneric;

/**
 * @date 2023/12/7 22:33
 */
public class CustomGeneric {
    public static void main(String[] args) {

    }
}
class Tigerr<T,R,M>{
    String name;
    R r;
    T t;
    M m;

    public Tigerr(String name, R r, T t, M m) {
        this.name = name;
        this.r = r;
        this.t = t;
        this.m = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}