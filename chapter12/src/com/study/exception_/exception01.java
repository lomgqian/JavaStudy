package com.study.exception_;

/**
 * @date 2023/7/23 21:15
 */
public class exception01 {
    public static void main(String[] args) {
        int num1=10;
int num2=0;
//int num1=10;
//int num2=0;
//int res=num1/num2;//程序会抛出异常，停止运行
       try {
           int res=num1/num2;
       }catch (Exception e){
          // e.printStackTrace();
           System.out.println("出现异常的原因"+e.getMessage());      }
        System.out.println(" keep running.........");
    }
}
