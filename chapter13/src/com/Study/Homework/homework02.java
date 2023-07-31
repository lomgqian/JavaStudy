package com.Study.Homework;

import java.util.Scanner;

/**
 * @date 2023/7/31 17:27
 */
public class homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String str1 = sc.next();
        System.out.println("请输入密码");
        String str2 = sc.next();
        System.out.println("请输入邮箱");
        String str3 = sc.next();
        String name=str1;
        String pwd=str2;
        String email=str3;
        try {
            userRegister(name,pwd,email);
            System.out.println("注册成功了");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    public static void userRegister(String name,String pwd,String email){
        int userlength=name.length();
        if(!(userlength>=2&&userlength<=4)){//1
            throw new RuntimeException("用户名长度是2，3，4");
        }

        if (!(pwd.length()==6&&isnumber(pwd))){//2
            throw new RuntimeException("密码要为数字");
        }

        int i = email.indexOf('@');//3
        int j = email.indexOf('.');
        if(!(i>0&&j>i)){
            throw new RuntimeException("错误");
        }

    }
    public static boolean isnumber(String str){
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (chars[i]<'0'||chars[i]>'9'){
                return false;
            }
        } return true;
    }
}
