package com.suanfa.sort;

import java.util.Arrays;

//冒泡排序

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {3,9,-1,10,-2};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));

        int[] testtime = new int[80000];
        for (int i = 0; i < 80000; i++) {
            testtime[i] = (int)(Math.random()*80000);
        }
        long start = System.currentTimeMillis();
        bubbleSort(testtime);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static void bubbleSort(int[] a){
        boolean flag = false;
        int temp = 0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j+1]){
                    flag= true;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            if (!flag){
                break;
            }else {
                flag = false;
            }
        }
    }
}
