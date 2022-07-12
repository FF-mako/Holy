package Leetcode.Top100;

public class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                res = nums[i];
                count++;
            }else{
               int r =  res == nums[i]?count++:count--;
            }
        }
        return res;
    }
}
