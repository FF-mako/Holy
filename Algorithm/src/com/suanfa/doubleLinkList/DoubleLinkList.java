package com.suanfa.doubleLinkList;

public class DoubleLinkList {
    Hero head = new Hero(0, "", "");

    public boolean isempty() {
        return head.next == null;
    }

    //增加
    public void add(Hero a) {
        Hero temp = head;
        while (true) {
            if (temp.next == null) {
                temp.next = a;
                a.pre = temp;
                break;
            } else {
                temp = temp.next;
            }
        }

    }

    //遍历
    public void list() {
        if (!isempty()) {
            Hero temp = head;
            while (true) {
                if (temp.next == null) {
                    break;
                } else {
                    System.out.println(temp.next);
                    temp = temp.next;
                }
            }
        }
    }

    //删除
    public void del(Hero a){


    }

}
