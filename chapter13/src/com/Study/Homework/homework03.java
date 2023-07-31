package com.Study.Homework;

/**
 * @date 2023/7/31 20:17
 */
public class homework03 {
    public static void main(String[] args) {
String str="yang jun jie";
    printName(str);

    }
    public static void printName(String str){
if(str==null){
    throw new RuntimeException("空的");
}
String[] name=str.split(" ");
if (name.length!=3){
    System.out.println("wrong");
    return;
}
String format=String.format("%s,%s,%c",name[2],name[0],name[1].toUpperCase().charAt(0));
        System.out.println(format );
    }
}
