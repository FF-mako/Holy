package com.search;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        System.out.println(binarySearch(arr, 0));

    }

    //binarySearch
    //左蓝色区域总在target左边
    public static int binarySearch(int[] arr, int target) {
        int l = -1;
        int r = arr.length;

        while (l + 1 != r) {
            int m = (l + r) / 2;
            if (target > arr[m]) {
                l = m;
            } else {
                r = m;
            }
        }
//        System.out.println(l);
//        System.out.println(r);
        if (r == arr.length || arr[r] > target) {
            return -1;
        }
        return r;
    }
}