package com.suanfa.doubleLinkList;

public class Demo {
    public static void main(String[] args) {
        Hero hero1 = new Hero(1, "宋江", "及时雨");
        Hero hero2 = new Hero(2, "宋江2", "及时雨2");
        Hero hero3 = new Hero(3, "宋江3", "及时雨3");
        Hero hero4 = new Hero(4, "宋江4", "及时雨4");
        DoubleLinkList dll = new DoubleLinkList();

        dll.add(hero1);
        dll.add(hero2);
        dll.add(hero3);
        dll.add(hero4);
        dll.list();

    }
}
