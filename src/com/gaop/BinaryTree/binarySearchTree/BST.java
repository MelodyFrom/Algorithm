package com.gaop.BinaryTree.binarySearchTree;

import com.gaop.BinaryTree.BNode;
import com.gaop.BinaryTree.traverse.InOrder;

/**
 * 二叉查找树 Binary Search Tree--基于二叉树的一种数据结构，以每个节点为根，其左子树的 data 域均小于根节点值；而其右子树的 data 域均大于根节点值。
 * @author carpeng.gao@qunar.com
 * @date 2019/1/21 14:32
 **/
public class BST {

    private BNode<Integer> root = null;

    public void insert(Integer[] params) {
        for (Integer param : params) {
            this.insert(new BNode<>(param));
        }
    }

    /**
     * 二叉查找树的插入算法
     * @param bNode 待插入节点
     */
    public void insert(BNode<Integer> bNode) {
        if (null == bNode)
            return;
        if (root == null) {
            root = bNode;
            return;
        }
        BNode<Integer> temp = root;
        while (true) {
            if (bNode.getData() > temp.getData()) { // 插入节点的值大于根节点值
                if (temp.getRchild() == null) { // 右子树为空
                    temp.setRchild(bNode);
                    break;
                } else {
                    temp = temp.getRchild();
                }
            } else if (bNode.getData() < temp.getData()) {// 插入节点值小于根节点值
                if (temp.getLchild() == null) { // 左子树为空
                    temp.setLchild(bNode);
                    break;
                } else {
                    temp = temp.getLchild();
                }
            }
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        Integer[] array = new Integer[]{12, 3, 1};
        bst.insert(array);
        InOrder.inOrder(bst.root);

        System.out.println();

        BST bst2 = new BST();
        Integer[] array1 = new Integer[]{12, 14, 1, 8, 9};
        bst2.insert(array1);
        InOrder.inOrder(bst2.root);
    }
}
