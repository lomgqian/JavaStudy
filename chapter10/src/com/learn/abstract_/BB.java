package com.learn.abstract_;

public class BB {
    public void job(){
        long start=System.currentTimeMillis();
        long num=0;
        for(long i=1;i<=100;i++) {
            num*=1;
        }
        long end=System.currentTimeMillis();
        System.out.println("BB执行时间"+(end-start));
    }
}
