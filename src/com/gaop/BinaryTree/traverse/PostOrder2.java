package com.gaop.BinaryTree.traverse;

import com.gaop.BinaryTree.BNode;

import java.util.Stack;

/**
 * 后续遍历二叉树的非递归版本
 *          2
 *        /  \
 *       4    5
 *      / \  / \
 *     8  9 10 11
 *            / \
 *           22 3
 *             /
 *            21
 * 8 9 4 10 22 21 3 11 5 2
 * @author gaopeng@doctorwork.com
 * @date 2019-01-18 23:01
 **/
public class PostOrder2 extends Base{

    public static void postOrder(BNode<Integer> bNode) {
        Stack<BNode<Integer>> stack = new Stack<>();
        BNode<Integer> temp = null;
        do {
            while (bNode != null) {
                stack.push(bNode);
                bNode = bNode.getLchild();
            }
            if (!stack.isEmpty()) {
                temp = stack.pop();
                if (temp.getRchild() != null) {
                    visit(temp.getRchild());
                }
                visit(temp);
            }
        } while (!stack.isEmpty() || bNode != null);
    }
}
