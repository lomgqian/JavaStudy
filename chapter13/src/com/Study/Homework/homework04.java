package com.Study.Homework;

/**
 * @date 2023/7/31 20:25
 */
public class homework04 {
    public static void main(String[] args) {
String num="12fsds  sgdsASD";
counterNUM(num);

    }
    public static void counterNUM(String str){
        if (str==null){
            System.out.println("wrong");
            return;
        }
        int strlen=str.length();
        int num=0;
        int lower=0;
        int upper=0;
        int other=0;
        for (int i=0;i<strlen;i++){
            if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
                num++;
            }else if (str.charAt(i)>='a'&&str.charAt(i)<='z'){
                lower++;
            }else if (str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                upper++;
            }else {
                other++;
            }
        }
        System.out.println("数字"+num+"小写"+lower+"大写"+upper+"其他"+other);
    }
}
