package com.tankgame04;


import javax.swing.*;

/**
 * @date 2024/1/9 15:07
 */
public class tankgame04 extends JFrame {
    Mypanel mp=null;//定义MYpanel
    public static void main(String[] args) {
        tankgame04 tankgame01=new tankgame04();
    }

    public tankgame04() {
        mp=new Mypanel();
        new Thread(mp).start();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
//P604停了吧
