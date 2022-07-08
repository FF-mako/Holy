package Leetcode.Top100.t70;

//2022-07-07
//70. 爬楼梯
//难度：简单
public class Solution {
    public int climbStairs(int n) {
        /*
        //递归，时间复杂度O平方
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }

        return climbStairs(n - 1) + climbStairs(n -2);*/

        int a = 0;
        int b = 0;
        int c = 1;

        for (int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}
