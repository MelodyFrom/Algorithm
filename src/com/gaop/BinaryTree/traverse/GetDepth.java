package com.gaop.BinaryTree.traverse;

import com.gaop.BinaryTree.BNode;

/**
 * 计算二叉树深度递归算法
 *  二叉树的深度计算--仍然可以归结为计算某个根节点下左右子树深度的问题。
 * @author gaopeng@doctorwork.com
 * @date 2019-01-14 22:58
 **/
public class GetDepth {

    public static int getDepth(BNode<Integer> bNode) {
        int ldept,rdept = 0;
        if (null == bNode) {
            return 0;
        } else {
            ldept = getDepth(bNode.getLchild());
            rdept = getDepth(bNode.getRchild());
            return (ldept > rdept ? ldept : rdept) + 1;
        }
    }

    public static void main(String[] args) {
        BNode<Integer> l1 = new BNode<>(8, null, null);
        BNode<Integer> l2 = new BNode<>(9, null, null);
        BNode<Integer> l3 = new BNode<>(4, l1, l2);
        BNode<Integer> l4 = new BNode<>(10, null, null);
        BNode<Integer> l5 = new BNode<>(11, null, null);
        BNode<Integer> l6 = new BNode<>(5, l4, l5);
        BNode<Integer> root = new BNode<>(2, l3, l6);
        System.out.println(getDepth(root));
    }
}
