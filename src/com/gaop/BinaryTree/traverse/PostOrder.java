package com.gaop.BinaryTree.traverse;

import com.gaop.BinaryTree.BNode;

/**
 * 后根次序遍历二叉树--递归实现
 * @author gaopeng@doctorwork.com
 * @date 2019-01-13 23:37
 **/
public class PostOrder extends Base {

    public static void postOrder(BNode<Integer> bNode) {
        if (null != bNode) {
            postOrder(bNode.getLchild());
            postOrder(bNode.getRchild());
            visit(bNode);
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
        postOrder(root);
    }
}
