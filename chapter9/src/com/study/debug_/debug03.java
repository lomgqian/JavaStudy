package com.study.debug_;
import java.util.Arrays;
public class debug03 {
    public static void main(String[] args) {
        int[]arr={1,-1,10,-20,100};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }
}
