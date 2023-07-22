package com.homework.一.homework13;

import com.homework.一.Teacher;

public class homework13 {
    public static void main(String[] args) {
        teacher teacher = new teacher("aa", '男', 50, 22);
        teacher.printinfo();
        System.out.println("--------------------------------------");
        Student student = new Student("小米", '男', 20, "2130110507");
        student.printinfo();



        Person[]persons=new Person[4];
        persons[0]=new Student("jack",'男',20,"111");
        persons[1]=new Student("aa",'男',21,"222");
        persons[2]=new teacher("jffk",'男',43,32);
        persons[3]=new teacher("fsdk",'男',40,33);
homework13 homework13=new homework13();
homework13.bubblesort(persons);
        for (int i = 0; i < persons.length ; i++) {
            System.out.println(persons[i].toString());
        }
        for (int i = 0; i < persons.length ; i++) {
            homework13.test(persons[i]);
        }
    }
    public void test(Person person){
        if(person instanceof Student){
            ((Student) person).study();
        }else if (person instanceof teacher){
            ((teacher) person).teacch();
        }else {
            System.out.println("...");
        }
    }
    public void bubblesort(Person[] persons){
        Person tmp=null;
        for (int i = 0; i < persons.length-1 ; i++) {
            for (int j = 0; j < persons.length-1-i ; j++) {

                if(persons[j].getAge()<persons[j+1].getAge()){
                    tmp=persons[j];
                    persons[j]=persons[j+1];
                    persons[j+1]=tmp;
                }
            }
        }

    }
}
