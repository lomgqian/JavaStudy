package com.study.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @date 2024/1/9 14:59
 */
public class Mypanel extends JPanel {
   Hero hero=null;

   public Mypanel(){
       hero=new Hero(100,100);

   }

   public void paint(Graphics g){
       super.paint(g);
       g.fillRect(0,0,1000,750);
       drawtank(hero.getX(),hero.getY(),g,0,0);
   }

   public void drawtank(int x,int y,Graphics g,int direct,int type){
       switch (type){
           case 0:
               g.setColor(Color.cyan);
               break;
           case 1:
               g.setColor(Color.red);
               break;
       }
switch (direct){
    case 0:
        g.fill3DRect(x,y,10,60,false);
        g.fill3DRect(x+30,y,10,60,false);
        g.fill3DRect(x+10,y+10,20,40,false);
        g.fillOval(x+10,y+20,20,20);
        g.drawLine(x+20,y+30,x+20,y);
        break;
    default:
        System.out.println("暂时无事发生");
}


   }
}
