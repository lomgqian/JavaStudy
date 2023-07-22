package com.learn.interface_;

public class interfacePolyArr {
    public static void main(String[] args) {
USB[] usbs=new USB[2];
usbs[0]=new mobilephone();
usbs[1]=new camera_();
for (int i=0;i< usbs.length;i++){
    usbs[i].work();
    if(usbs[i] instanceof mobilephone ) {
        ((mobilephone) usbs[i]).call();

    }
}

}
    }

interface USB{
    void work();
}
class mobilephone implements USB{
    public void work(){
        System.out.println("手机在工作");
    }
    public void call(){
        System.out.println("手机在打电话 作");
    }
}
class camera_ implements USB{
    public void work(){
        System.out.println("相机在工作");
    }
}
