package com.binarysorttree;

public class BinarySortTree {
    private Node root;

    //添加节点方法
    public void add(Node node){
        if (root == null){
            root = node;
        }else {
            root.add(node);
        }
    }

    //中序遍历
    public void infixOrder(){
        if (root != null){
            root.infixOrder();
        }else {
            System.out.println("树为空，不能遍历");
        }
    }
}
