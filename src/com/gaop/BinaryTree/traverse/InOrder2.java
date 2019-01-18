package com.gaop.BinaryTree.traverse;

import com.gaop.BinaryTree.BNode;

import java.util.Stack;

/**
 * 中序遍历的非递归版本
 *          2
 *        /  \
 *       4    5
 *      / \  / \
 *     8  9 10 11
 *            / \
 *           22 3
 *             /
 *            21
 * 8 4 9 2 10 5 22 11 21 3
 * @author gaopeng@doctorwork.com
 * @date 2019-01-18 22:37
 **/
public class InOrder2 extends Base{

    public static void inOrder(BNode<Integer> bNode) {
        Stack<BNode<Integer>> stack = new Stack<>();
        BNode<Integer> temp = null;
        do {
            while (bNode != null) {
                stack.push(bNode);
                bNode = bNode.getLchild();
            }
            if (!stack.isEmpty()) {
                temp = stack.pop();
                visit(temp);
                bNode = temp.getRchild();
            }
        } while (!stack.isEmpty() || bNode != null);
    }

    public static void main(String[] args) {
        BNode<Integer> l1 = new BNode<>(8, null, null);
        BNode<Integer> l2 = new BNode<>(9, null, null);
        BNode<Integer> l3 = new BNode<>(4, l1, l2);
        BNode<Integer> l4 = new BNode<>(10, null, null);

        BNode<Integer> l11 = new BNode<>(21, null, null);
        BNode<Integer> l12 = new BNode<>(22, null, null);

        BNode<Integer> l0 = new BNode<>(3, l11, null);
        BNode<Integer> l5 = new BNode<>(11, l12, l0);
        BNode<Integer> l6 = new BNode<>(5, l4, l5);
        BNode<Integer> root = new BNode<>(2, l3, l6);
        inOrder(root);
    }

}
