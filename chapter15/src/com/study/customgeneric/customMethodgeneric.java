package com.study.customgeneric;

/**
 * @date 2024/1/4 16:41
 */
public class customMethodgeneric {
    public static void main(String[] args) {
        //泛型方法的使用

    }
}
class car{
    public void run(){
        //普通方法
    }//<T,R>就是泛型
    //就是提供给fly使用的
    public<T,R> void go(T t,R r){
//泛型方法
    }
}
class fish<T,R>{
    public void run(){
        //普通方法
    }
    public<T,R> void go(T t,R r){
//泛型方法
    }
}