package com.study.try_;

/**
 * @date 2023/7/25 15:33
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {//ctrl+alt+t快捷键
            String str="ddd";
            int a=Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息"+e.getMessage());
        }

    }
}
