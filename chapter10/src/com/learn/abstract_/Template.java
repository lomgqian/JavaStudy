package com.learn.abstract_;

abstract public class Template {
    public abstract void job();
    public void calcualte(){
        long start=System.currentTimeMillis();
        job();
        long end=System.currentTimeMillis();
        System.out.println("AA执行时间"+(end-start));
    }
}
