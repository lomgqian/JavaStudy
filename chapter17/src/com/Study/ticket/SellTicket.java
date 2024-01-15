package com.Study.ticket;

/**
 * @date 2024/1/14 15:10
 */
public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();               //ctrl+/可以多选注释
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();//会超出售票，文体会在互斥那里解决
    }
}
class SellTicket03 implements Runnable{

    private  int Ticketnum=100;
private boolean loop=true;

    public synchronized void m(){
        if(Ticketnum<=0){
            System.out.println("售票结束");
            loop=false;
           return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace( );
        }
        System.out.println("窗口"+Thread.currentThread().getName()+"售出了一张票"+
                "剩余票数"+(--Ticketnum));
    }
    @Override
    public void run() {
        while (loop){
          m();
        }
    }
}
class SellTicket01 extends Thread{
    private static int Ticketnum=100;
    @Override
    public void run() {
while (true){
    if(Ticketnum<=0){
        System.out.println("售票结束");
        break;
    }
    try {
        Thread.sleep(50);
    } catch (InterruptedException e) {
        e.printStackTrace( );
    }
    System.out.println("窗口"+Thread.currentThread().getName()+"售出了一张票"+
            "剩余票数"+(--Ticketnum));
}
         }
}
class SellTicket02 implements Runnable{

    private  int Ticketnum=100;
    @Override
    public void run() {
        while (true){
            if(Ticketnum<=0){
                System.out.println("售票结束");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace( );
            }
            System.out.println("窗口"+Thread.currentThread().getName()+"售出了一张票"+
                    "剩余票数"+(--Ticketnum));
        }
    }
}