package com.Study.set_;

/**
 * @date 2023/8/25 9:19
 */
public class HashSetStructure {
    public static void main(String[] args) {
Node[] table=new Node[16];
        System.out.println("table="+table);
        Node john = new Node("john", null);
        table[2]=john;
        Node tom = new Node("tom", null);
        john.next=tom;
        Node jack = new Node("jack", null);
        tom.next=jack;
        //0 null
        //1 null
        //2 john-->tom-->jack
        //3 null
        //4 null
        //5 null
        //6 null
        //7 null
        //8 null
        //9 null
        //10 null
        //11 null
        //12 null
    }
}
class Node{
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}