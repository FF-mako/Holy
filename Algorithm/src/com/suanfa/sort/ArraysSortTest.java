package com.suanfa.sort;

import java.util.Arrays;

public class ArraysSortTest {
    public static void main(String[] args) {
        int[] TestTime = new int[80000];
        for (int i = 0; i < 80000; i++) {
            TestTime[i] = (int) (Math.random() * 80000);
        }
        //测试时间
        long start = System.currentTimeMillis();
        Arrays.sort(TestTime);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
