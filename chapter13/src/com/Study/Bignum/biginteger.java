package com.Study.Bignum;

import java.math.BigInteger;

/**
 * @date 2023/7/30 11:27
 */
public class biginteger {
    public static void main(String[] args) {
        //long l=244444444444444444444;//编程中需要处理很大的整数，long不够用
        //System.out.println(l);
        BigInteger bigInteger = new BigInteger("12335346534645674574");
        BigInteger bigInteger2 = new BigInteger("1233545674574");
        System.out.println(bigInteger);
        //对 BigInteger进行加减乘除，需要使用对应的方法
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);//加
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);//减
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply);//乘
        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);//除

    }
}
