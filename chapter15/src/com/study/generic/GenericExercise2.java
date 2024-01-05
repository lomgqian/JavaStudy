package com.study.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @date 2023/11/23 0:11
 */
public class GenericExercise2 {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee("tom",20000,new MyDate(2003,11,24)));
        arrayList.add(new Employee("jack",30000,new MyDate(2005,12,24)));
        arrayList.add(new Employee("tom",20000,new MyDate(2003,1,24)));


        System.out.println(arrayList);
        System.out.println("---对雇员进行排序---");
        arrayList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)){
                    System.out.println("类型不正确");
                    return 0;
                }
                int i=o1.getName().compareTo(o2.getName());
                if (i!=0){
                    return i;
                }
int yearminus=o1.getBirthday().getYear()-o2.getBirthday().getYear();
                if (yearminus!=0){
                    return yearminus;
                }

                int mouthminus=o1.getBirthday().getMouth()-o2.getBirthday().getMouth();
                if (mouthminus!=0){
                    return mouthminus;
                }
                return o1.getBirthday().getYear()-o2.getBirthday().getYear();


            }
        }
        );

        System.out.println(arrayList);
    }
}
