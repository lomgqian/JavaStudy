package com.Study.set_;

import java.util.HashSet;

/**
 * @date 2023/8/27 11:32
 */
public class HashSetIncrement {
    public static void main(String[] args) {
        //扩容是临界值乘以加载因子时就开始扩容
        //扩容乘以两倍
        HashSet set = new HashSet();
        for (int i = 0; i <100 ; i++) {
set.add(i);
        }
        for (int i = 0; i <=7 ; i++) {
            set.add(new A(i) );
        }
        for (int i = 0; i <=7 ; i++) {
            set.add(new B(i) );
        }
    }
}

class B{
    private int n;

    public B(int n) {
        this.n = n;
    }
public int hashcode(){
        return 200;
}
}
class A{
    private int n;

    public A(int n) {
        this.n = n;
    }
    public int hashcode(){
        return 100;
    }
}