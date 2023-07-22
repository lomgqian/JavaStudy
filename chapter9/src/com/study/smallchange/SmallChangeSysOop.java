package com.study.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOop {
    boolean loop=true;
    Scanner scanner=new Scanner(System.in);
    String key="";
    String details="-------------零钱通明细--------------";
    double money=0;
    double balance=0;
    Date date=null;
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note="";

    public void menu(){
        do{
            System.out.println("-------------零钱通菜单-----------");
            System.out.println("-------------1.收益明细");
            System.out.println("-------------2.收益入账");
            System.out.println("-------------3.消费");
            System.out.println("-------------4.退出");
            System.out.println("请选择1-4：");
            key=scanner.next();


            switch (key){
                case "1":
                   this.detail();
                    break;
                case "2":
                   this.income();

                    break;
                case "3":
                    this.buy();
                    break;
                case "4":
                    this.quit();
                    break;
                default:
                    System.out.println("菜单选择有误");
            }
        }while(loop);
    }
    public  void detail(){
        System.out.println(details);
    }
    public  void income(){
        System.out.println("收益入账金额:");
        money=scanner.nextDouble();
        if(money<=0){
            System.out.println("请输入正确的金额");
            return;
        }
        balance+=money;
        date=new Date();
        details+="\n收益入账\t"+money+"\t"+sdf.format(date)+"\t"+balance;
    }
    public  void buy(){
        System.out.println("消费金额");
        money=scanner.nextDouble();
        if(money<=0||money>balance){
            System.out.println("请输入正确的金额,应该在0-"+balance+"之间");
            return;
        }
        System.out.println("消费说明");
        note=scanner.next();
        balance-=money;
        date=new Date();
        details+="\n"+note+"\t"+money+"\t"+sdf.format(date)+"\t"+balance;
    }
    public  void quit(){
        String choice=" ";
        while (true){
            System.out.println("你确定要退出吗?y/n");
            choice=scanner.next();
            if ("y".equals(choice)||"n".equals(choice)){
                break;
            }
        }
        if(choice.equals("y")){
            loop=false;
        }
    }
}
