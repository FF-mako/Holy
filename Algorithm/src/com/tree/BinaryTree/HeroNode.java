package com.tree.BinaryTree;

public class HeroNode {
    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int no, String name) {
        super();
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    //前序遍历
    public void preOrder() {
        System.out.println(this);
        //递归向左子树前序遍历
        if (this.left != null) {
            this.left.preOrder();
        }
        //递归向右子树前序遍历
        if (this.right != null) {
            this.right.preOrder();
        }
    }


    //中序遍历
    public void infixOrder() {
        //递归向左子树前序遍历
        if (this.left != null) {
            this.left.infixOrder();
        }
        System.out.println(this);
        //递归向右子树前序遍历
        if (this.right != null) {
            this.right.infixOrder();
        }
    }


    //后序遍历
    public void postOrder() {
        //递归向左子树前序遍历
        if (this.left != null) {
            this.left.postOrder();
        }
        //递归向右子树前序遍历
        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }


    //前序遍历查找
    public HeroNode preOderSearch(int no) {
        //检查当前节点
        if (this.no == no) {
            return this;
        }

        HeroNode resNode = null;
        if (this.left != null) {
            resNode = this.left.preOderSearch(no);
        }
        if (resNode != null) {  //左子树找到，不浪费直接返回
            return resNode;
        }

        //向右子树查找
        if (this.right != null) {
            resNode = this.right.preOderSearch(no);
        }
        //不管右子树有无结果，终返回一个resNode
        return resNode;
    }


    //中序遍历查找
    public HeroNode infixOderSearch(int no) {
        HeroNode resNode = null;
        if (this.left != null) {
            resNode = this.left.infixOderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }

        //左子树未查出
        if (this.no == no) {
            return this;
        }

        if (this.right != null) {
            resNode = this.right.infixOderSearch(no);
        }

        return resNode;

    }


    //后序遍历查找
    public HeroNode postOderSearch(int no){
        HeroNode resNode = null;
        if (this.left != null){
            resNode = this.left.postOderSearch(no);
        }
        if (resNode != null){
            return resNode;
        }

        if (this.right != null){
            resNode = this.right.postOderSearch(no);
        }
        if (resNode != null){
            return resNode;
        }

        if (this.no == no){
            return this;
        }
            return resNode;

    }









}
