package com.study.enum_;

/**
 * @date 2023/7/22 11:32
 */
public class EnumDetails {
    public static void main(String[] args) {
Music.CLASSMUSIC.test();
    }
}
//使用enum后不能再继承其他类。因为enum会隐性继承Enum，而Java是单继承机制
//enum实现的枚举类可以实现接口
interface playing{
    public void test();
}
enum Music implements playing{
    CLASSMUSIC;

    @Override
    public void test() {
        System.out.println("..................");
    }
}