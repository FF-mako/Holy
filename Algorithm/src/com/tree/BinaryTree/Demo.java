package com.tree.BinaryTree;

public class Demo {
    public static void main(String[] args) {
        //创建一颗二叉树
        BinaryTree binaryTree = new BinaryTree();
        //创建一个需要的节点
        HeroNode root = new HeroNode(1, "松江");
        HeroNode node2 = new HeroNode(2, "吴用");
        HeroNode node3 = new HeroNode(3, "卢俊义");
        HeroNode node4 = new HeroNode(4, "林冲");
        HeroNode node5 = new HeroNode(5, "关胜");


        //说明，现在为手动创建二叉树，后面我们学习递归的方式创建二叉树
        root.setLeft(node2);
        root.setRight(node3);
        node3.setRight(node4);
        node3.setLeft(node5);
        binaryTree.setRoot(root);


        //测试前序遍历
        System.out.println("前序遍历");
        binaryTree.preOrder();

        //中序遍历
        System.out.println("中序遍历");
        binaryTree.infixOrder();

        //后序遍历
        System.out.println("后序遍历");
        binaryTree.postOrder();


        //前序遍历查找
        HeroNode preNode1 = binaryTree.preOderSearch(5);
        System.out.println("-------------前序遍历查找------------");
        System.out.println(preNode1);

        //中序遍历查找
        HeroNode preNode2 = binaryTree.infixOderSearch(5);
        System.out.println("------------中序遍历查找-------------");
        System.out.println(preNode2);

        //后序遍历查找
        HeroNode preNode3 = binaryTree.postOderSearch(5);
        System.out.println("-----------后序遍历查找--------------");
        System.out.println(preNode3);


    }
}
