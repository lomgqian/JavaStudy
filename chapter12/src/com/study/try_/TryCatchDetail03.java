package com.study.try_;

/**
 * @date 2023/7/25 15:56
 */
public class TryCatchDetail03 {
    public static void main(String[] args) {
        try {
            int n1=10;
            int n2=0;
            int res=n1/n2;
            System.out.println(res);
        } finally {
            System.out.println("执行了finally。。。。。");
        }
        System.out.println("程序正常执行。。。。。。");//不会运行
//        try {
//            int n1=10;
//            int n2=2;
//            int res=n1/n2;
//            System.out.println(res);
//        } finally {
//            System.out.println("执行了finally。。。。。");
//        }
//        System.out.println("程序正常执行。。。。。。");
    }
}
