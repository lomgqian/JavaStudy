package com.study.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @date 2024/1/7 16:36
 */
@SuppressWarnings({"all"})

public class DrawCricle extends JFrame {
    private Mypanel mp=null;

    public static void main(String[] args) {
new DrawCricle();
    }
    public DrawCricle(){
        mp=new Mypanel();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class Mypanel extends JPanel{
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawOval(1,20,100,100);
        //g.setColor(Color.blue);



















    }
}