package com.suanfa.digui.Queue8;

public class Demo1 {
    int max = 8;
    int[] array = new int[max];

    public static  void main(String[] args) {
        Demo1 queue8= new Demo1();
        queue8.check(0);
    }


    private boolean judge(int n){
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n]||Math.abs(n-i) == Math.abs(array[n] - array[i])){
                return false;
            }
        }
        return true;
    }

    private void check(int n) {
        if (n == max) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            array[n] = i;
            if (judge(n)){
                check(n+1);
            }
        }
    }

    //写一个方法将皇后摆放的位置输出
    private void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
