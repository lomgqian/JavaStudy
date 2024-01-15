package com.Study.Thread;

/**
 * @date 2024/1/13 12:14
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start();
        //没法调用
        Thread thread = new Thread(dog);//创建Thread对象，将dog对象放入Thread
        thread.start();
    }
}
class Dog implements Runnable{
int count=0;
    @Override
    public void run() {//run只是一个普通方法，没法真正地起一个线程
        while (true){
            System.out.println("小狗汪汪叫"+(++count)+Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
