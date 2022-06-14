package com.suanfa.sort;


import java.util.Arrays;

//希尔排序
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 4};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] TestTime = new int[80000];
        for (int i = 0; i < 80000; i++) {
            TestTime[i] = (int) (Math.random() * 80000);
        }
//测试时间
        long start = System.currentTimeMillis();
        shellSort(TestTime);
        long end = System.currentTimeMillis();
        System.out.println("希尔排序所花时间："+(end - start));
    }



    //移位法
    public static void shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j = j - gap;
                    }
                    arr[j] = temp;
                }
            }
        }
    }
    //下面的垃圾代码不用看
    //在插入时采用交换法
    public static void shellSort01(int[] arr) {
        int temp = 0;
        int count = 0;

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {

                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }

    }
}
