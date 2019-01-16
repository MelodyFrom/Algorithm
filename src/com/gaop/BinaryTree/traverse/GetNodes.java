package com.gaop.BinaryTree.traverse;

import com.gaop.BinaryTree.BNode;

/**
 * 获取节点数量--尝试使用递归实现，整个的实现逻辑和递归检索叶子节点数量的算法是类似的。
 *          2
 *        /  \
 *       4    5
 *      / \  / \
 *     8  9 10 11
 *              \
 *              3
 *             / \
 *            21 22
 * @author carpeng.gao@qunar.com
 * @date 2019/1/16 11:54
 **/
public class GetNodes {

    public static int getNodes(BNode<Integer> bNode) {
        if (null == bNode)
            return 0;
        if (null == bNode.getLchild() && null == bNode.getRchild())
            return 1;
        int lNodes = getNodes(bNode.getLchild());
        int rNodes = getNodes(bNode.getRchild());
        return lNodes + rNodes + 1;
    }

    public static void main(String[] args) {
        BNode<Integer> l1 = new BNode<>(8, null, null);
        BNode<Integer> l2 = new BNode<>(9, null, null);
        BNode<Integer> l3 = new BNode<>(4, l1, l2);
        BNode<Integer> l4 = new BNode<>(10, null, null);

        BNode<Integer> l11 = new BNode<>(21, null, null);
        BNode<Integer> l12 = new BNode<>(22, null, null);

        BNode<Integer> l0 = new BNode<>(3, l11, l12);
        BNode<Integer> l5 = new BNode<>(11, null, l0);
        BNode<Integer> l6 = new BNode<>(5, l4, l5);
        BNode<Integer> root = new BNode<>(2, l3, l6);
        System.out.println(getNodes(root));
    }
}
