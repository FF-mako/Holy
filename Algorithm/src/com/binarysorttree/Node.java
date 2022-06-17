package com.binarysorttree;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    //添加节点
    public void add(Node node) {
        if (node == null) {
            return;
        }

        //判断传入节点的值，比较
        if (node.value < this.value) {
            //左子节点为null直接挂上
            if (this.left == null) {
                this.left = node;
            } else {
                //递归继续
                this.left.add(node);
            }
        } else {//添加的节点的值大于，则走右边
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }

    }


    //中序遍历
    public void infixOrder() {
        if (this.left != null) {
            this.left.infixOrder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.infixOrder();
        }
    }
}
