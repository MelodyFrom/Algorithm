package com.gaop.BinaryTree.threadTraverse;

import com.gaop.BinaryTree.ThreadBNode;

/**
 * 使用中序遍历来实现一个二叉树的线索化，注意二叉树线索化算法的时间复杂度为 O(n) <br>
 * 在此处标明tag的默认用法：ltag = 0 表示指针域指向了左孩子，否则用于指向前驱的左线索；rtag = 0 表示指针域指向了右孩子，否则用于
 * 指向后继的右线索。
 * @author gaopeng@doctorwork.com
 * @date 2019-01-15 22:34
 **/
public class InOrder {
    static ThreadBNode<Integer> pre = null;//记录前驱结点的指针
    public static void Tn_thread(ThreadBNode<Integer> threadBNode) {
        if (null != threadBNode) {
            Tn_thread(threadBNode.getLchild());
            threadBNode.setLtag(null == threadBNode.getLchild() ? 1 : 0);
            threadBNode.setRtag(null == threadBNode.getRchild() ? 1 : 0);
            if (null != pre) {
                if (pre.getRtag() == 1)
                    pre.setRchild(threadBNode);//将前驱结点的后继指为当前节点
                if (threadBNode.getLtag() == 1)
                    threadBNode.setLchild(pre);
            }
            pre = threadBNode;
            Tn_thread(threadBNode.getRchild());
        }
    }

    public static void main(String[] args) {
        ThreadBNode<Integer> l1 = new ThreadBNode<>(8, null, null);
        ThreadBNode<Integer> l2 = new ThreadBNode<>(9, null, null);
        ThreadBNode<Integer> l3 = new ThreadBNode<>(4, l1, l2);
        ThreadBNode<Integer> l4 = new ThreadBNode<>(10, null, null);

        ThreadBNode<Integer> l11 = new ThreadBNode<>(21, null, null);
//        ThreadBNode<Integer> l12 = new ThreadBNode<>(22, null, null);

        ThreadBNode<Integer> l0 = new ThreadBNode<>(3, l11, null);
        ThreadBNode<Integer> l5 = new ThreadBNode<>(11, null, l0);
        ThreadBNode<Integer> l6 = new ThreadBNode<>(5, l4, l5);
        ThreadBNode<Integer> root = new ThreadBNode<>(2, l3, l6);
        Tn_thread(root);
        System.out.println("线索化结束");
        System.out.println(l1);
    }
}
