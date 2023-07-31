package com.Study.Homework;

/**
 * @date 2023/7/31 11:36
 */
public class homework01 {
    public static void main(String[] args) {
String str="abdch";
        try {
            str=reverse(str,1,3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(str);
    }
    public static String reverse(String str,int start,int end){
        if (str!=null&&start>=0&&end>=start&&end<str.length()){
            throw  new RuntimeException("参数不正确");
        }
        char[] chars=str.toCharArray();
        char temp=' ';
        for (int i=start,j=end;i<j;i++,j--){
            temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }
        return new String(chars);
    }
}
