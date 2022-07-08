package Leetcode.Top100.t53;

//2022-07-07
//53. 最大子数组和
//难度：简单
public class Solution {
    public int maxSubArray(int[] nums) {

        //贪心
        int pre = 0;
        int maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns,pre);
        }
        return maxAns;
    }
}
