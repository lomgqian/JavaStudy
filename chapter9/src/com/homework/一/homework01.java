package com.homework.一;

public class homework01 {
    public static void main(String[] args) {
        Persion[] persions = new Persion[3];
        persions[0]=new Persion("tom",20,"工程师");
        persions[1]=new Persion("nancy",22,"老师");
        persions[2]=new Persion("jack",21,"公务员");
        for (int i = 0; i < persions.length ; i++) {
            System.out.println(persions[i]);
        }
        Persion tmp=null;
        for (int i = 0; i < persions.length-1 ; i++) {
            for (int j = 0; j < persions.length-1-i ; j++) {
       //if(persions[j].getAge()<persions[j+1].getAge()){
       if(persions[j].getName().length()<persions[j+1].getName().length()){
       tmp=persions[j];
       persions[j]=persions[j+1];
       persions[j+1]=tmp;
       }
            }
        }
        System.out.println("修改后");
        for (int i = 0; i < persions.length ; i++) {
            System.out.println(persions[i]);
        }
    }

}
class Persion{
    private String name;
    private int age;
    private  String job;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Persion(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}