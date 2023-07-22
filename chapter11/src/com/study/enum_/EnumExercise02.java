package com.study.enum_;

/**
 * @date 2023/7/22 11:25
 */
public class EnumExercise02 {
    public static void main(String[] args) {
Week[] week=Week.values();
        System.out.println("----------信息如下----------");
for(Week week1:week){
    System.out.println(week1);
}
    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"),SUNDAY("星期日");
    private  String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
