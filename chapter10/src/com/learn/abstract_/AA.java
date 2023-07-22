package com.learn.abstract_;

public class AA extends Template {

    public void job(){
        long num=0;
        for(long i=1;i<=100000;i++) {
        num+=1;
        }
    }
//    public void job2(){
//        long start=System.currentTimeMillis();
//        long num=0;
//        for(long i=1;i<=90000;i++) {
//            num+=1;
//        }
//        long end=System.currentTimeMillis();
//        System.out.println("AAjob2执行时间"+(end-start));
//    }
}
