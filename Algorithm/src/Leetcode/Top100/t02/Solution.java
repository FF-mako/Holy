package Leetcode.Top100.t02;

//2022-06-20
//2.两数相加
//难度：中等
//心得：需辅助指针tem，来跳过if (ans == null)   原因  ans.next必为null
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans = null;
        ListNode tem = null;

        int carry = 0;

        while (l1 != null || l2 != null){
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (ans == null){
                ans = new ListNode(sum % 10);
                tem = ans;
            }else {
                tem.next = new ListNode(sum % 10);
                tem = tem.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0){
            tem.next = new ListNode(carry);
        }
        return ans;

        /*
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
        */

    }
}