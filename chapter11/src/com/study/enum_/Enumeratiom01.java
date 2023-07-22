package com.study.enum_;

public class Enumeratiom01 {
    public static void main(String[] args) {
        Season season = new Season("summer", "hot");//可以随意更改，不能体现季节是固定的对象
    }
}
class Season{
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
//枚举，有限的对象