package Leetcode.Top100.t20;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

//2022-07-04
//20. 有效的括号
//难度：简单
public class Solution {
    public boolean isValid(String s) {
      /*  int length = s.length() / 2;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }

        return s.length() == 0;*/


        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {//碰到右括号
                if (stack.isEmpty() || stack.poll() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

}
