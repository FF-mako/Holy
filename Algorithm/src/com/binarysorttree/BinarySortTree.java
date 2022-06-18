package com.binarysorttree;

public class BinarySortTree {
    private Node root;

    //添加节点方法
    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    //中序遍历
    public void infixOrder() {
        if (root != null) {
            root.infixOrder();
        } else {
            System.out.println("树为空，不能遍历");
        }
    }

    //查找要删除的节点
    public Node search(int value) {
        if (root == null) {
            return null;
        } else {
            return root.search(value);
        }
    }

    //查找父节点
    public Node searchParent(int value) {
        if (root == null) {
            return null;
        } else {
            return root.searchParent(value);
        }
    }

    //编写方法

    /**
     * @param node 传入的节点（当做二叉排序树的根节点）
     * @return 返回以 node 为根节点的二叉排序树的最小节点的值
     */
    public int delRigthTreeMin(Node node) {
        Node target = node;
        //循环查找左子节点，找最小值
        while (target.left != null) {
            target = target.left;
        }
        delNode(target.value);
        return target.value;
    }

    //删除节点
    public void delNode(int value) {
        if (root == null) {
            return;
        } else {
            //1.找要删除的节点 targetNode
            Node targetNode = search(value);
            //如果没有找到
            if (targetNode == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                root = null;
                return;
            }

            //去找到targetNode的父节点
            Node parent = searchParent(value);

            //删叶子节点
            if (targetNode.left == null && targetNode.right == null) {//判断子节点类型
                //判断targetNode处于父节点左侧还是右侧
                if (parent.left != null && parent.left.value == value) {//左侧
                    parent.left = null;
                } else if (parent.right != null && parent.right.value == value) {//右侧
                    parent.right = null;
                }
            } else if (targetNode.left != null && targetNode.right != null) {//删除有两颗子树的节点
                /*
                思路是将targetNode的右子树最小节点放在targetNode位置
                或者targetNode的左子树最大节点放在targetNode位置
                */
                int minVal = delRigthTreeMin(targetNode.right);
                targetNode.value = minVal;

            } else {//删除只有一颗子树的节点
                //有左节点
                if (targetNode.left != null) {
                    if (parent != null) {
                        if (parent.left.value == value) {
                            parent.left = targetNode.left;
                        } else {
                            parent.right = targetNode.left;
                        }
                    } else {
                        root = targetNode.left;
                    }
                } else {//有右节点
                    if (parent != null) {
                        if (parent.left.value == value) {
                            parent.left = targetNode.right;
                        } else {
                            parent.right = targetNode.right;
                        }
                    } else {
                        root = targetNode.right;
                    }
                }

            }


        }
    }


}
