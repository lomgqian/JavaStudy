package com.tankgame03;



/**
 * @date 2024/1/9 14:59
 */
public class Hero extends tank {
    shot shot=null;


    public Hero(int x, int y,int direct) {
        super(x, y,direct);
    }


    public void shotEnemy(){

switch (getDirect()){
    case 0:
        shot=new shot(getX()+20,getY(),0);
        break;
    case 1:
        shot=new shot(getX()+60,getY()+20,1);
        break;
    case 2:
        shot=new shot(getX()+20,getY()+60,2);
        break;
    case 3:
        shot=new shot(getX(),getY()+20,3);
        break;
}
new Thread(shot).start();
    }
}
