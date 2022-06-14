package com.hashtab;

import java.util.Scanner;

public class HashTabDemo {
    public static void main(String[] args) {

        //创建哈希表
        HashTab hashTab = new HashTab(7);

        //写一个简单的菜单
        int key;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1：添加雇员");
            System.out.println("2：显示雇员");
            System.out.println("3：查找雇员");
            System.out.println("4：退出系统");

            key = scanner.nextInt();
            switch (key) {
                case 1:
                    System.out.println("输入id");
                    int id = scanner.nextInt();
                    System.out.println("输入名字");
                    String name = scanner.next();
                    //创建雇员
                    Emp emp = new Emp(id, name);
                    hashTab.add(emp);
                    break;
                case 2:
                    hashTab.list();
                    break;
                case 3:
                    System.out.println("请输入要查找的id");
                    id = scanner.nextInt();
                    hashTab.findEmpById(id);
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }
        }


    }
}
