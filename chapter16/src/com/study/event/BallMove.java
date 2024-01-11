package com.study.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @date 2024/1/9 15:54
 */
public class BallMove extends JFrame {
    Mypanel mp=null;
    public static void main(String[] args) {
BallMove ballMove=new BallMove();
    }

    public BallMove(){
        mp=new Mypanel();
        this.add(mp);
        this.setSize(400,300);
        //窗口对象可以监听面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class Mypanel extends JPanel implements KeyListener {
    int x=10;
    int y=10;

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.fillOval(x,y,20,20);

}


    @Override//字符输出会触发
    public void keyTyped(KeyEvent e) {

    }

    @Override//某个键按下去会触发
    public void keyPressed(KeyEvent e) {
      //  System.out.println((char)e.getKeyCode()+"被按下。。。。。。");
        if (e.getKeyCode()==KeyEvent.VK_DOWN){
y++;
        } else if (e.getKeyCode()==KeyEvent.VK_UP) {
            y--;
        }else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
            x++;
        }else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
            x--;
        }

        this.repaint( );//重绘
    }

    @Override//某个键松开会触发
    public void keyReleased(KeyEvent e) {

    }
}
