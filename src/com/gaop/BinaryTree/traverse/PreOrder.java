package com.gaop.BinaryTree.traverse;

import com.gaop.BinaryTree.BNode;

/**
 * 先序遍历二叉树--运用递归思想完成的算法代码
 * 用于示例的完全二叉树
 *          2
 *        /  \
 *       4    5
 *      / \  / \
 *     8  9 10 11
 * @author gaopeng@doctorwork.com
 * @date 2019-01-13 23:10
 **/
public class PreOrder extends Base{

    public static void preOrder(BNode<Integer> bNode) {
        if (null != bNode) {
            visit(bNode);
            preOrder(bNode.getLchild());
            preOrder(bNode.getRchild());
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
        preOrder(root);
    }

}
