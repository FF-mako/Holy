package com.suanfa.sort;

import java.util.Arrays;

//选择排序
public class SelectSort {
    public static void main(String[] args) {
       int[] arr = {2,3,4,6,1,9,0};
       selectSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] TestTime = new int[80000];
        for (int i = 0; i < 80000; i++) {
            TestTime[i] = (int)(Math.random()*80000);
        }
        //测试时间
        long start = System.currentTimeMillis();
        selectSort(TestTime);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void selectSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min){
                  minIndex = j;
                  min = arr[j];
                }
            }
            if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

        }
    }
}
