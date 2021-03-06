package com.tree.BinaryTree;

public class BinaryTree {
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    //前序遍历
    public void preOrder() {
        if (this.root != null) {
            this.root.preOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }
    }

    //中序遍历
    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }
    }

    //后序遍历
    public void postOrder() {
        if (this.root != null) {
            this.root.postOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }
    }


    //前序遍历查找
    public HeroNode preOderSearch(int no) {
        if (root != null) {
            return root.preOderSearch(no);
        } else {
            return null;
        }
    }

    //中序遍历查找
    public HeroNode infixOderSearch(int no) {
        if (root != null) {
            return root.infixOderSearch(no);
        } else {
            return null;
        }
    }

    //后序遍历查找
    public HeroNode postOderSearch(int no) {
        if (root != null) {
            return root.preOderSearch(no);
        } else {
            return null;
        }
    }

    //删除
    public void delNode(int no){
        if (root != null){
            if (root.getNo() == no){
                root = null;
            }else {
                //递归删除
                root.delOrder(no);
            }
        }else {
            System.out.println("空树，不能删除");
        }
    }


}
