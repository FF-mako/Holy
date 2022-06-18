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


    //查找要删除的节点

    /**
     * @param value 希望删除的节点的值
     * @return 如果找到返回该节点，否则返回null
     */
    public Node search(int value) {
        if (value == this.value){
            return this;
        }else if (value < this.value){//往左子树查
            //如果左子节点为空
            if (this.left == null){
                return null;
            }
            return this.left.search(value);
        }else {
            if (this.right == null){
                return null;
            }
            return this.right.search(value);
        }
    }


    //查找要删除节点父节点

    /**
     *
     * @param value  希望删除的节点的值
     * @return   要删除节点父节点,无则null
     */
    public Node searchParent(int value){

        //如果当前节点就是要删除的节点的父节点，就返回
        if ((this.left != null && this.left.value == value) ||
                (this.right != null && this.right.value == value)){
            return this;
        }else {
            //如果查找的值小于当节点的值，并且当节点的左子节点不为空
            if (value < this.value && this.left != null){
                return this.left.searchParent(value);
            }else if (value >= this.value && this.right != null){
                return this.right.searchParent(value);
            }else {
                return null;
            }
        }



    }



































}
