package com.suanfa.sort;

public class QuickSort {
    public static void main(String[] args) {

//        int[] TestTime = new int[80000];
//        for (int i = 0; i < 80000; i++) {
//            TestTime[i] = (int) (Math.random() * 80000);
//        }
//        //测试时间
//        long start = System.currentTimeMillis();
//        qiuckSort(TestTime,0,79999);
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
        int[] TestTime = new int[]{5, 3, 1, 2, 4};
        qiuckSort(TestTime, 0, 4);
        for (int i : TestTime) {
            System.out.println(i);
        }


    }

    //    public static void quickSort(int[] arr, int left, int rigth) {
//
//    }
    public static int[] qiuckSort(int arry[], int begin, int last) {
        if (begin > last) {
            return null;
        }
        int a = begin;
        int b = last;
        int pivot = arry[begin];
        while (begin < last) {
            while (begin < last && pivot <= arry[last]) {
                last--;
            }
            if (pivot > arry[last]) {
                arry[begin] = arry[last];
                begin++;
            }
            if (begin == last) {
                arry[begin] = pivot;
                break;
            }

            while (begin < last && arry[begin] < pivot) {
                begin++;
            }
            if (pivot < arry[begin]) {
                arry[last] = arry[begin];
                last--;
            }
            if (begin == last) {
                arry[begin] = pivot;
            }
        }
        if (last > a) {
            qiuckSort(arry, a, last - 1);
        }
        if (b > begin) {
            qiuckSort(arry, begin + 1, b);
        }

        return arry;
    }


}
