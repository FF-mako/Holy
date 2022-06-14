package com.suanfa.linklist;

public class SingleLinkListDemo {
    public static void main(String[] args) {
        Heronode hero1 = new Heronode(1, "宋江", "及时雨");
        Heronode hero2 = new Heronode(2, "宋江2", "及时雨2");
        Heronode hero3 = new Heronode(3, "宋江3", "及时雨3");
        Heronode hero4 = new Heronode(4, "宋江4", "及时雨4");
        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.addByOrder(hero1);
        singleLinkList.addByOrder(hero4);
        singleLinkList.addByOrder(hero3);
        singleLinkList.addByOrder(hero3);
        singleLinkList.addByOrder(hero2);
        Heronode newsb = new Heronode(2, "傻逼", "大聪明");
        singleLinkList.del(3);
        singleLinkList.update(newsb);


        singleLinkList.list();
        System.out.println(SingleLinkList.getLength(singleLinkList.getHead()));
    }

}

class SingleLinkList {
    private Heronode head = new Heronode(0, "", "");

    public Heronode getHead() {
        return head;
    }


    //添加
    public void add(Heronode heronode) {
        Heronode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;

        }
        temp.next = heronode;
    }

    //插入按顺序
    public void addByOrder(Heronode heronode) {
        Heronode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > heronode.no) {
                break;
            } else if (temp.next.no == heronode.no) {
                flag = true;
            }
            temp = temp.next;
        }
        //判断flag值
        if (flag) {
            System.out.printf("准备插入的英雄的编号%d已经存在了，不能加入\n", heronode.no);
        } else {
            heronode.next = temp.next;
            temp.next = heronode;
        }
    }

    //修改，根据no来修改
    public void update(Heronode newHeronode) {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        Heronode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == newHeronode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = newHeronode.name;
            temp.nickname = newHeronode.nickname;
        } else {
            System.out.printf("没有找到编号%d的节点，不能修改\n", newHeronode.no);
        }
    }

    //删除节点
    public void del(int no) {
        Heronode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("删除节点不存在");
        }
    }

    //遍历
    public void list() {
        if (head.next == null) {
            System.out.println("空");
            return;
        }
        Heronode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    //方法：获取单链表的节点个数
    public static int getLength(Heronode head) {
        if (head.next == null) {
            return 0;
        }
        int length = 0;
        Heronode cur = head.next;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }

    //查找倒数第k个节点【新浪面试】
    public static Heronode findLastIndexNode(Heronode head, int index) {
        if (head.next == null) {
            return null;
        }
        int size = getLength(head);
        if (index <= 0 || index > size) {
            return null;
        }
        Heronode temp = head.next;
        for (int i = 0; i < size - index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}

class Heronode {
    public int no;
    public String name;
    public String nickname;
    public Heronode next;  //有点套娃的意思，next当Heronode用

    public Heronode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Heronode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}

