package com.suanfa.search;

import java.util.Arrays;

public class SeqSearch {
    public static void main(String[] args) {
        int[] arr = {1, 9, 11, -1, 34, 89};
        Arrays.sort(arr);


    }

    //最原始
    public static int seqSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //递归
//    public static int binarySearch

}

