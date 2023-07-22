package com.study.enum_;

/**
 * @date 2023/7/21 17:08
 */
public class Enumeratiom02 {
    public static void main(String[] args) {
        System.out.println(Season02.spring);
    }
}
//演示定义枚举类型
class Season02{
    private String name;
    private String desc;
    //在类内部直接创建固定的对象
    //优化，加入final修饰符
    public static Season02 spring=new Season02("Spring","good");

    private Season02(String name, String desc) {//构造器私有化，防止new
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

//去掉set相关的代码，防止属性被修改


    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
