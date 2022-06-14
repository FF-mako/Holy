package com.suanfa.sort;

import java.util.Arrays;

//插入排序
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 1, 9, 0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] TestTime = new int[80000];
        for (int i = 0; i < 80000; i++) {
            TestTime[i] = (int) (Math.random() * 80000);
        }
        //测试时间
        long start = System.currentTimeMillis();
        insertSort(TestTime);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //待插入的数
            int insertVal = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            //循环结束意味着插入位置已找到
            arr[insertIndex + 1] = insertVal;
        }
    }
}

