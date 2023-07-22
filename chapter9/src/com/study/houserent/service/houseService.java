package com.study.houserent.service;

import com.study.houserent.domain.House;

public class houseService {
private House[] houses;
private  int housenums=1;
private int counter=1;

public houseService(int size){
    houses=new House[size];
    houses[0]=new House(1,"jack","111111","shanghai",4000,"未出租");
}

public  boolean del(int delint){
        int index=-1;
        for (int i=0;i<housenums;i++){
            if (delint==houses[i].getId()){
                index=i;
            }
        }
        if(index==-1){
            return false;
        }
        for (int i=index;i<housenums-1;i++){
            houses[i]=houses[i+1];
        }
        houses[housenums-1]=null;
        housenums--;
        return true;
}

public  boolean add(House newhouse){
    if(housenums==houses.length){
        System.out.println("数组上限已满");
        return false;
    }
    houses[housenums++]=newhouse;
    newhouse.setId(++counter);
    return true;
}

public House find(int findid) {
    for (int i=0;i<housenums;i++){
        if(findid==houses[i].getId()){
            return houses[i];
        }
    }return null;
}

public House[]list(){
    return houses;
}
}
