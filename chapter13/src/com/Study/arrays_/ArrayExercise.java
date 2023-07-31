package com.Study.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @date 2023/7/30 10:19
 */
public class ArrayExercise {
    public static void main(String[] args) {
Book[] books=new Book[4];
books[0]=new Book("aa",45);
        books[1]=new Book("bbb",66);
        books[2]=new Book("cccc",22);
        books[3]=new Book("dd",44);
        /*Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                Book b1=(Book)o1;
                Book b2=(Book)o2;
                double a=b2.getPrice()-b1.getPrice();
                if (a>0) {
                    return -1;
                }else if(a<0){
                    return 1;
                }else {
                    return 0;
                }
            }
        }*/Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                Book b1=(Book)o1;
                Book b2=(Book)o2;
                return b2.getName().length()-b1.getName().length();
            }
        });
    }
}
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}