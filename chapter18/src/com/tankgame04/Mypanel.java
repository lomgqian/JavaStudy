package com.tankgame04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @date 2024/1/9 14:59
 */
public class Mypanel extends JPanel implements KeyListener,Runnable {
   Hero hero=null;//定义我的坦克
   Vector<enemytank> enemytanks=new Vector<>();
   int enemyTanksize=3;


   public Mypanel(){
       hero=new Hero(100,100,0);
       hero.setSpeed(5);


       for (int i = 0; i < enemyTanksize; i++) {
         enemytank enemytank= new enemytank((100*(i+1)),0,2);
         shot shot1=new shot(enemytank.getX()+20,enemytank.getY()+60,enemytank.getDirect());

           enemytank.shots.add(shot1 );
           new Thread(shot1).start();
           enemytanks.add(enemytank);


       }

   }

   public void paint(Graphics g){
       super.paint(g);
       g.fillRect(0,0,1000,750);
       drawtank(hero.getX(),hero.getY(),g,hero.getDirect(),0);


       if (hero.shot!=null&&hero.shot.islive!=false){
           //g.fill3DRect(hero.shot.x,hero.shot.y,1,1,false);
           g.draw3DRect(hero.shot.x,hero.shot.y,1,1,false);
       }



//画出敌人的坦克
       for (int i = 0; i < enemytanks.size(); i++) {
           enemytank enemytank= enemytanks.get(i);
           drawtank(enemytank.getX(),enemytank.getY(),g,enemytank.getDirect(),1);
           //画出子弹
           for (int j = 0; j < enemytank.shots.size(); j++) {
               shot shot2=enemytank.shots.get(j);
               if (shot2.islive){
    g.draw3DRect(shot2.x,shot2.y,1,1,false);
}else {
                   enemytank.shots.remove(shot2);
               }
           }
       }
   }

   public void drawtank(int x,int y,Graphics g,int direct,int type){
       switch (type){//控制类型
           case 0:
               g.setColor(Color.cyan);
               break;
           case 1:
               g.setColor(Color.red);
               break;
       }
switch (direct){//控制方向
    case 0://向上
        g.fill3DRect(x,y,10,60,false);
        g.fill3DRect(x+30,y,10,60,false);
        g.fill3DRect(x+10,y+10,20,40,false);
        g.fillOval(x+10,y+20,20,20);
        g.drawLine(x+20,y+30,x+20,y);
        break;
    case 1://向右
        g.fill3DRect(x,y,60,10,false);
        g.fill3DRect(x,y+30,60,10,false);
        g.fill3DRect(x+10,y+10,40,20,false);
        g.fillOval(x+20,y+10,20,20);
        g.drawLine(x+30,y+20,x+60,y+20);
        break;
    case 2://向下
        g.fill3DRect(x,y,10,60,false);
        g.fill3DRect(x+30,y,10,60,false);
        g.fill3DRect(x+10,y+10,20,40,false);
        g.fillOval(x+10,y+20,20,20);
        g.drawLine(x+20,y+30,x+20,y+60);
        break;
    case 3://向左
        g.fill3DRect(x,y,60,10,false);
        g.fill3DRect(x,y+30,60,10,false);
        g.fill3DRect(x+10,y+10,40,20,false);
        g.fillOval(x+20,y+10,20,20);
        g.drawLine(x+30,y+20,x,y+20);
        break;
    default:
        System.out.println("暂时无事发生");
}


   }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
if (e.getKeyCode()==KeyEvent.VK_W){
hero.setDirect(0);//修改坦克方向
    //修改坦克坐标
hero.moveUP();
} else if (e.getKeyCode()==KeyEvent.VK_D) {
    hero.setDirect(1);
    hero.moveRIGHT();
} else if (e.getKeyCode()==KeyEvent.VK_S) {
    hero.setDirect(2);
    hero.moveDOWN();
} else if (e.getKeyCode()==KeyEvent.VK_A) {
    hero.setDirect(3);
    hero.moveLEFT();
}
if (e.getKeyCode()==KeyEvent.VK_J){
    hero.shotEnemy();
}

this.repaint( );//重绘
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true){
            try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.repaint();
    }
   }
}
