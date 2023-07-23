package com.study.Homework;

/**
 * @date 2023/7/23 15:54
 */
public class homework04 {
    public static void main(String[] args) {
        cellphone cellphone = new cellphone();
        /*匿名内部类是
        new Icalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        }
        同时也是一个对象*/
        cellphone.testwork(new Icalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },10,8);
    }
}
interface Icalculate{
    public double work(double n1,double n2);

}
class cellphone{
    public void testwork(Icalculate icalculate,double n1,double n2){
        double result=icalculate.work(n1,n2);
        System.out.println("计算后的结果="+result);

    }
}