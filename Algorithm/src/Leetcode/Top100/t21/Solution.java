package Leetcode.Top100.t21;

import java.util.ArrayList;
import java.util.Arrays;

//2022-07-04
//21. 合并两个有序链表
//难度：简单
public class Solution {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);

        ListNode listNode = mergeTwoLists(listNode1, listNode2);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
        System.out.println(listNode.next.next.next.val);
        System.out.println(listNode.next.next.next.next.val);
        System.out.println(listNode.next.next.next.next.next.val);


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

       /* //暴力脑瘫
       if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode temp = list1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list2;
        ArrayList<Integer> integers = new ArrayList<>();
        while (list1!= null) {
            integers.add(list1.val);
            list1 = list1.next;
        }
        int size = integers.size();
        int[] ints = new int[size];
        int j = 0;
        for (Integer integer : integers) {
            ints[j] = integer;
            j++;
        }
        Arrays.sort(ints);
        ListNode listNode = new ListNode(ints[0]);
        ListNode temp2 = listNode;
        for (int i = 1; i < ints.length; i++) {
            temp2.next = new ListNode(ints[i]);
            temp2 = temp2.next;
        }
        return listNode;*/

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }


    }
}
