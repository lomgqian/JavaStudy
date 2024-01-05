package com.Study.list_;

/**
 * @date 2023/8/16 17:14
 */
public class LinkedLIst01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node yjj = new Node("yjj");

        //连接
        jack.next=tom;
        tom.next=yjj;
        yjj.pre=tom;
        tom.pre=jack;

        Node first=jack;
        Node last=yjj;

        System.out.println("=====");
        while (true){
            if (first==null ){
                break;
            }
            System.out.println(first);
            first=first.next;
        }

        System.out.println("=====");
        while (true){
            if (last==null ){
                break;
            }
            System.out.println(last);
            last=last.pre;
        }

        Node smith = new Node("smith");
        smith.next=yjj;
        smith.pre=tom;
        yjj.pre=smith;
        tom.next=smith;

        first=jack;//重置一下first
        last=yjj;

        System.out.println("=====");
        while (true){
            if (first==null ){
                break;
            }
            System.out.println(first);
            first=first.next;
        }

        System.out.println("=====");
        while (true){
            if (last==null ){
                break;
            }
            System.out.println(last);
            last=last.pre;
        }
    }

}
class Node{
    public Object item;
    public Node next;
    public  Node pre;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name="+ item ;
    }
}