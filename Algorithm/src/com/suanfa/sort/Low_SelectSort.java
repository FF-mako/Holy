package com.suanfa.sort;

import java.util.Arrays;

public class Low_SelectSort {
    //低端选择排序
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 1, 9, 0};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] testtime = new int[80000];
        for (int i = 0; i < 80000; i++) {
            testtime[i] = (int) (Math.random() * 80000);
        }
        //测试时间
        long start = System.currentTimeMillis();
        selectSort(testtime);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


