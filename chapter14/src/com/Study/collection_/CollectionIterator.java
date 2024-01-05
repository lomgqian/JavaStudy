package com.Study.collection_;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @date 2023/8/12 10:53
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col=new ArrayList();
        col.add(new Books("三国演义","罗贯中",10.1));
        col.add(new Books("dd","gg",90.1));
        col.add(new Books("dd","aa",19.1));

        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
//        while (iterator.hasNext()) {//快捷键itit
//            //显示所有快捷键ctrl+j
//            Object next =  iterator.next();
//
//        }



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
        return "Books{" +
                "name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", price=" + price +
                '}';
    }
}