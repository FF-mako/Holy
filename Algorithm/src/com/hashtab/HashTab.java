package com.hashtab;

public class HashTab {

    private EmpLinkedList[] empLinkedListsArray;
    private int size;

    //构造器
    public HashTab(int size) {
        this.size = size;
        empLinkedListsArray = new EmpLinkedList[size];

        //分别初始化每个链表
        for (int i = 0; i < size; i++) {
            empLinkedListsArray[i] = new EmpLinkedList();
        }
    }


    //添加雇员
    public void add(Emp emp) {
        //hash化
        int empLinkedListNO = hashFun(emp.id);
        //存入链表
        empLinkedListsArray[empLinkedListNO].add(emp);


    }

    //遍历所有链表
    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListsArray[i].list(i);
        }
    }



    //根据id查找雇员
    public void findEmpById(int id){

        int empLikedListNo = hashFun(id);
        Emp emp = empLinkedListsArray[empLikedListNo].findEmpById(id);
        if (emp != null){
            System.out.printf("在第%d条链表中找到 雇员 id = %d\n", (empLikedListNo + 1), id);
        }else {
            System.out.println("在哈希表中，没有找到该雇员~");
        }
    }













    //编写散列函数，简单取模法
    public int hashFun(int id) {
        return id % size;
    }

































}
