package com.study.Homework;

/**
 * @date 2023/7/23 21:02
 */
public class homework08 {
    public static void main(String[] args) {
        Colour red = Colour.RED;
        red.show();
        switch (red){
            case RED:
                System.out.println("red");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            case BLACK:
                System.out.println("black");
                break;
            default:
                System.out.println("ok");
        }
    }
}
interface IMYInterface{
    public void show();
}
enum Colour implements IMYInterface{
   RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0)
    ,YELLOW(255,255,0),GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Colour(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }
    public void show(){
        System.out.println(redValue+greenValue+blueValue);
    }
}
