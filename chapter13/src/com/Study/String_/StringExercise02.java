package com.Study.String_;

/**
 * @date 2023/7/28 10:54
 */
public class StringExercise02 {
    public static void main(String[] args) {
        String a="yjj";//a指向常量池的“yjj”
        String b=new String("yjj");//指向的是堆中的对象
        b.intern();//调用此方法时，若池中已经有一个等同于此String对象的字符串（用equals方法确定），则返回
        // 池中的字符串，否则就将此字符串对象添加到池中，并返回此String对象的引用
    }
}
//1.equals单纯比较是否内容相同
//2.==引用类型之间比较地址
