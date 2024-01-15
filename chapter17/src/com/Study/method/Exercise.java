package com.Study.method;

/**
 * @date 2024/1/14 16:09
 */
public class Exercise {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new T1());
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi"+i);
            if (i==5){
t1.start();

t1.join();
            }
        }
    }
}
class T1 implements Runnable{
    int count=0;
    @Override
    public void run() {
        while (true){
            System.out.println("hello"+(++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==10){
break;
            }
        }

    }
}