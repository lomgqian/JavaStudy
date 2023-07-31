package com.Study.String_;

/**
 * @date 2023/7/29 9:41
 */
public class StringMethod01 {
    public static void main(String[] args) {
        String str1="jack";
        String str2="Jack";
        System.out.println(str2.equals(str1));
        String str3="jaCK";
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str2.length());
    }
}
