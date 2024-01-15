package com.Study.Thread;

/**
 * @date 2024/1/12 15:56
 */
public class thread01 {
    public static void main(String[] args)throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        //cat.run();
        System.out.println("主线程继续执行"+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程"+i);
            Thread.sleep(1000);
        }
    }
}
class Cat extends Thread{
    int times=0;
    @Override
    public void run() {
        while (true){
        System.out.println("线程测试"+(++times));
        //ctrl+alt+t
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (times==8){
            break;
        }}
    }
}
