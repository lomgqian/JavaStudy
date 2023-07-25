package com.study.try_;

import java.util.Scanner;

/**
 * @date 2023/7/25 16:24
 */
public class TryCatchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        String inputer="";
        while (true){
            System.out.println("请输入数字");
            inputer=scanner.next();
            try {
                num=  Integer.parseInt(inputer);//此处可能抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("不是整数");
            }

        }
        System.out.println("输入的值是"+num);
    }
}
