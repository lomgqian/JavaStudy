package com.Study.arrays_;

import java.util.Comparator;

/**
 * @date 2023/7/30 9:55
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,7,9,10};
        bubble(arr);
    }
    public static void bubble(int[ ] arr){
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }        }
    }
    public static void bubble2(int[ ] arr, Comparator c){
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (c.compare(arr[j],arr[j+1])>0 ){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }        }
    }
}

