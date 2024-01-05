package com.Study.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2023/8/15 9:58
 */
public class ListExercise2{
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Books("yjj","me",300));
        list.add(new Books("争夺家督","oh",200));
        list.add(new Books("石马湾语","ok",400));
        list.add(new Books("瞎几把打","who",50));
        list.add(new Books("增能彭对","what",890));
        System.out.println("--------增强for原输出结果是------");
        for (Object o :list) {
            System.out.println(o);
        }

//如何对集合进行一个排序

sort(list);



//增强for
        System.out.println("--------增强for现输出结果是------");
        for (Object o :list) {
            System.out.println(o);
        }

    }
    public static void sort(List list){
        int listsize=list.size();
        for (int i = 0; i < listsize-1; i++) {
            for (int j = 0; j < listsize-1-i; j++) {
                Books books1=(Books)list.get(j);
                Books books2=(Books)list.get(j+1);
                if (books1.getPrice()>books2.getPrice()){
                    list.set(j,books2);
                    list.set(j+1,books1);
                }
            }
        }
    }
}
class Books{
    private String name;
    private String writer;
    private double price;

    public Books(String name, String writer, double price) {
        this.name = name;
        this.writer = writer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称："+name+"\t\t价格:"+price+"\t\t作者:"+writer;
    }
}