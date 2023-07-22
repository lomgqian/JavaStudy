package com.study.houserent.view;

import com.study.houserent.domain.House;
import com.study.houserent.utils.Utility;
import com.study.houserent.service.houseService;


public class mainMeun {
    private boolean loop = true;
    private char key = ' ';
    private houseService houseService=new houseService(10);

public void mainmenu() {
        do {
            System.out.println("-------------房屋出租系统菜单-----------");
            System.out.println("-------------1.新增房源");
            System.out.println("-------------2.查找房屋");
            System.out.println("-------------3.删除房屋");
            System.out.println("-------------4.修改房屋信息");
            System.out.println("-------------5.房屋列表");
            System.out.println("-------------6.退    出");
            System.out.println("请选择1-6：");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addhouse();
                    break;
                case '2':
                    search();
                    break;
                case '3':
                    delhouse();
                    break;
                case '4':
                    undate();
                    break;
                case '5':
                   listhouse();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("菜单选择有误");


            }
        }while (loop) ;
}

public void delhouse(){
    System.out.println("-------------删除房屋信息-----------");
    System.out.println("请输入待删除房屋的编号（-1退出）");
    int delint=Utility.readInt();
    if(delint==-1){
        System.out.println("放弃删除房屋信息");
        return;
    }
   char choice= Utility.readConfirmSelection();
    if(choice=='Y'){
     if(houseService.del(delint)){
         System.out.println("删除成功");
     }else {
         System.out.println("删除失败");
     }
    }else {
        System.out.println("未退出");
    }
}

public void exit(){
    char c=Utility.readConfirmSelection();
    if(c=='Y'){
        loop=false;
    }
}

public void listhouse(){
        System.out.println("-------------房屋列表-----------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t\t月租\t\t状态（已租出/未租出）");
        House[] houses = houseService.list();
        for (int i=0;i<houses.length;i++){
            if(houses[i]==null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("-------------房屋列表完成-----------");
}

public void addhouse(){
        System.out.println("-------------添加房屋-----------");
        System.out.println("姓名:");
        String name=Utility.readString(8);
        System.out.println("电话:");
        String phone=Utility.readString(12);
        System.out.println("住址:");
        String address=Utility.readString(8);
        System.out.println("月租:");
        int rent=Utility.readInt(8);
        System.out.println("状态:");
        String state=Utility.readString(8);
        House newhouse=new House(0,name,phone,address,rent,state);

        if (houseService.add(newhouse)) {
            System.out.println("-------------添加失败-----------");
        } else {
            System.out.println("-------------添加完成-----------");
        }
}

public void search(){
    System.out.println("-------------查找房屋-----------");
    System.out.println("请输入id");
    int findid=Utility.readInt();
    House house = houseService.find(findid);
    if(house!=null){
        System.out.println(house);
    }else {
        System.out.println("未找到");
    }
}

public void undate(){
    System.out.println("-------------删除房屋信息-----------");
    System.out.println("请输入待删除房屋的编号（-1退出）");
    int updateid=Utility.readInt();
    if(updateid==-1){
        System.out.println("放弃修改房屋信息");
        return;
    }
    House house = houseService.find(updateid);
    if(house==null){
        System.out.println("你要修改的房屋不存在");
        return;
    }
    System.out.println("姓名（"+house.getName()+"):");
    String name=Utility.readString(8,"");
    if (!"".equals(name)){
        house.setName(name);
    }
    System.out.println("电话（"+house.getPhone()+"):");
    String phone=Utility.readString(12,"");
    if (!"".equals(phone)){
        house.setPhone(phone);
    }
    System.out.println("地址（"+house.getAddress()+"):");
    String address=Utility.readString(18,"");
    if (!"".equals(address)){
        house.setAddress(address);
    }
    System.out.println("租金（"+house.getRent()+"):");
    int rent=Utility.readInt(-1);
    if (rent!=-1){
        house.setRent(rent);
    }
    System.out.println("状态（"+house.getState()+"):");
    String state=Utility.readString(8,"");
    if (!"".equals(state)){
        house.setState(state);
    }
    System.out.println("修改成功");
}

}
