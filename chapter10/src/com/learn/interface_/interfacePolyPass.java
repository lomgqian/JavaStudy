package com.learn.interface_;

public class interfacePolyPass {
    public static void main(String[] args) {
        IG ig = new Teacher();
        IH ih = new Teacher();
    }
}
interface IH{
    void hi();
}
interface IG extends IH{}
class Teacher implements IG{
public void hi(){
    System.out.println("hi!");
}
}