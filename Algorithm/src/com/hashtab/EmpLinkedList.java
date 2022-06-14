package com.hashtab;

public class EmpLinkedList {


    //头指针
    private Emp head;//默认null

    //添加
    public void add(Emp emp) {
        //链表为空
        if (head == null) {
            head = emp;
            return;
        }
        Emp curEmp = head;//定义一个辅助指针
        while (true) {
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;//辅助指针后移
        }
        curEmp.next = emp;
    }


    //遍历链表
    public void list(int no) {
        if (head == null) {
            System.out.println("第 " + no + " 链表为空");
            return;
        }
        System.out.print("第 " + no + " 链表的信息为");
        Emp curEmp = head;//辅助指针
        while (true) {
            System.out.printf("=>> id=%d name=%s\t", curEmp.id, curEmp.name);
            System.out.println();
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next;
        }
    }


    //根据id查找
    public Emp findEmpById(int id) {
        //判断链表为空
        if (head == null) {
            System.out.println("链表为空");
            return null;
        }
        //辅助指针
        Emp curEmp = head;
        while (true) {
            if (curEmp.id == id) {
                break;//这时curEmp就指向要查找的雇员
            }
            if (curEmp.next == null) {
                curEmp = null;
                break;
            }
            curEmp = curEmp.next;
        }
        return curEmp;
    }


}












































