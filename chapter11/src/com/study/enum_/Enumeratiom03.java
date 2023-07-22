package com.study.enum_;

/**
 * @date 2023/7/22 9:44
 */
public class Enumeratiom03 {
    public static void main(String[] args) {
        System.out.println(Season3.SPRING);
        System.out.println(Season3.SUMMER);
        System.out.println(Season3.AUTUMN);
        System.out.println(Season3.WINTER);


    }
}
enum Season3{
     SPRING("SPRING","GOOD"),SUMMER("SUMMER","HOT"),
    AUTUMN("AUTUMN","GREAT"),WINTER("WINTER","COLD");
//1.使用关键字代替class
//2.public static final Season3 spring=new Season3("Spring","good");直接使用
//   SPRING("SPRING","GOOD");常量名（实参列表）
//3.实参列表里有多个常量对象，用，隔开（有误）------有多个常量，用，隔开
//若使用enum来实现枚举，要求将定义的常量对象写在最前面




    private String name;
    private String desc;
    //在类内部直接创建固定的对象
    //优化，加入final修饰符
//    public static Season3 spring=new Season3("Spring","good");
//    public static Season3 summer=new Season3("summer","good");
//    public static Season3 autumn=new Season3("autumn","good");
//    public static Season3 winter=new Season3("winter","good");


    private Season3() {
    }

    private Season3(String name, String desc) {//构造器私有化，防止new
        this.name = name;
        this.desc = desc;
    }
//get方法
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
//去掉set相关的代码，防止属性被修改
    @Override
    public String toString() {//Tostring
        return "Season02{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
