package com.study.tankgame;

import javax.swing.*;

/**
 * @date 2024/1/9 15:07
 */
public class tankgame01 extends JFrame {
    Mypanel mp=null;//定义MYpanel
    public static void main(String[] args) {
        tankgame01 tankgame01=new tankgame01();
    }

    public tankgame01() {
        mp=new Mypanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
