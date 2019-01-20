package com.gaop.BinaryTree.traverse;

import com.gaop.BinaryTree.BNode;

import java.util.Stack;

/**
 * 后续遍历二叉树的非递归版本，非递归版本的后续遍历感觉比先序和中序遍历非递归版本有一些不同的点，同样的思路用在后序遍历上不行。
 * 这里需要标记一下每一个入栈元素的类型，即标记出这是一个左子节点还是一个右子节点
 *          2
 *        /  \
 *       4    5
 *      / \  / \
 *     8  9 10 11
 *       / \  / \
 *     23 24 22 3
 *             /
 *            21
 * 8 23 24 9 4 10 22 21 3 11 5 2
 * @author gaopeng@doctorwork.com
 * @date 2019-01-18 23:01
 **/
public class PostOrder2 extends Base{

    static int LEFT_PUSH = 0;// 入栈节点的左右子树是否已经被访问--0表示其左右子树还没有被全部访问

    static int RIGHT_PUSH = 1;// 表示其左右子树正在被访问

    public static void postOrder(BNode<Integer> bNode) {
        Stack<BNode<Integer>> stack = new Stack<>();
        Stack<Integer> rlStack = new Stack<>();
        BNode<Integer> temp = null;
        do {
            while (bNode != null) {
                stack.push(bNode);
                rlStack.push(0);
                bNode = bNode.getLchild();
            }
            while (!stack.isEmpty() && rlStack.peek() == 1) {
                visit(stack.pop());
                rlStack.pop();
            }

            if (!stack.isEmpty()) {
                rlStack.pop();
                rlStack.push(1);
                bNode = stack.peek().getRchild();
            }
        } while (!stack.isEmpty() || bNode != null);
    }

    public static void main(String[] args) {
        BNode<Integer> l1 = new BNode<>(8, null, null);

        BNode<Integer> l13 = new BNode<>(23, null, null);
        BNode<Integer> l14 = new BNode<>(24, null, null);

        BNode<Integer> l2 = new BNode<>(9, l13, l14);

        BNode<Integer> l3 = new BNode<>(4, l1, l2);
        BNode<Integer> l4 = new BNode<>(10, null, null);

        BNode<Integer> l11 = new BNode<>(21, null, null);
        BNode<Integer> l12 = new BNode<>(22, null, null);

        BNode<Integer> l0 = new BNode<>(3, l11, null);
        BNode<Integer> l5 = new BNode<>(11, l12, l0);
        BNode<Integer> l6 = new BNode<>(5, l4, l5);
        BNode<Integer> root = new BNode<>(2, l3, l6);
        postOrder(root);
    }
}
