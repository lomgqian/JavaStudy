package com.Study.set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @date 2023/8/28 10:15
 */
public class LinkHashSetSourse {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("liu",1001));
        set.add(123);
        set.add("hsp");
        System.out.println("set=" +set);
        //LinkHashSet加入元素和取出元素/数据的顺序一致
        //LinkHashSet是有序的
        //<K,V>key,value
    }
}
class Customer{
    private String name;
    private  int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}