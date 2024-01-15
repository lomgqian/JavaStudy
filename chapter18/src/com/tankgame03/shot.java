package com.tankgame03;

/**
 * @date 2024/1/15 14:15
 */
public class shot implements Runnable{
    int x;
    int y;
    int direct=0;
    int speed=3;

boolean islive=true;
    public shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
while (true){
    try {
        Thread.sleep(50);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    switch (direct){
        case 0://上
y-=speed;
break;
        case 1://右
            x+=speed;
            break;
        case 2://下
            y+=speed;
            break;
        case 3://左
            x-=speed;
            break;
    }
    System.out.println("x="+x+"y="+y);
if (!(x>=0&&x<=1000&&y>=0&&y<=750)){
    islive=false;
    break;
}
}












    }
}
