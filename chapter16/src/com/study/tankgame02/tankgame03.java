package com.study.tankgame02;


import javax.swing.*;
import java.awt.event.KeyListener;

/**
 * @date 2024/1/9 15:07
 */
public class tankgame03 extends JFrame {
    Mypanel mp=null;//定义MYpanel
    public static void main(String[] args) {
        tankgame03 tankgame01=new tankgame03();
    }

    public tankgame03() {
        mp=new Mypanel();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
