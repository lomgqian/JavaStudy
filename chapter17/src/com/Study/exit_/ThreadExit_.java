package com.Study.exit_;

/**
 * @date 2024/1/14 15:36
 */
public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        System.out.println("主线程main休眠10秒");
        Thread.sleep(10000);
        t.setLoop(false);
    }
}
class T extends Thread{
    int count=0;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    private boolean loop=true;
    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t在运行中"+(++count));
        }    }
}