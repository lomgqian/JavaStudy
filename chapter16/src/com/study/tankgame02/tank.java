package com.study.tankgame02;

/**
 * @date 2024/1/9 14:57
 */
public class tank {
    private int x;
    private int y;
    private  int direct;
    private int speed=1;


    public tank(int x, int y,int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }
public void moveUP(){
        y=y-speed;
}
    public void moveLEFT(){
        x-=speed;
    }
    public void moveDOWN(){
        y=y+speed;
    }
    public void moveRIGHT(){
        x+=speed;
    }
    public int getDirect() {
        return direct;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
