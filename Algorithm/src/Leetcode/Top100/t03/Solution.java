package Leetcode.Top100.t03;

import java.util.HashSet;
import java.util.Set;

//2022-06-30
//3.无重复字符的最长子串
//难度：中等
public class Solution {
    public int lengthOfLongestSubstring(String s) {
   /*
    官方解答
    //哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        //右指针，初始值为-1
        int rk = -1, ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0){
                //左指针右移，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))){
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            //比较了不同ans之间的最大值，若rk - i + 1 比 旧ans大则取代旧ans
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;*/

        //记录字符上一次出现的位置
        int[] last = new int[128];
        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int index = c;
            start = Math.max(start, last[index] + 1);
            res = Math.max(res, i - start + 1);
            last[index] = i;

        }


        return res;
    }
}
