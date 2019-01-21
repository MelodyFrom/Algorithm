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

    /**
     * 二叉查找树的查找方法
     * @param param 目标值
     * @return
     */
    public Integer get(Integer param) {
        if (null == param)
            return null;
        BNode<Integer> temp = root;
        while (true) {
            if (temp.getData() > param) {
                if (temp.getLchild() != null)
                    temp = temp.getLchild();
                else
                    return null;
            } else if (temp.getData() < param) {
                if (temp.getRchild() != null)
                    temp = temp.getRchild();
                else
                    return null;
            } else {
                return temp.getData();
            }
        }
    }

    /**
     * 二叉查找树的删除方法
     * @param param 待删除数值
     * @return 删除成功返回 true，否则返回 false
     */
    public boolean remove(Integer param) {
        if (null == param)
            return true;
        BNode<Integer> pre = null;
        int rl = 1;
        while (true) {
            BNode<Integer> temp = root;
            pre = temp;//保存前一个节点--即保存一个父节点
            if (root.getData() > param) {
                temp = temp.getLchild();
                rl = 1;//表示走到了左子树
            } else if (root.getData() < param) {
                temp.getRchild();
                rl = 0;//表示走到了右子树
            } else {
                //找到了要删除的节点
                if (temp.getRchild() == null && temp.getLchild() == null) {
                    // 目标节点没有任何子节点
                    if (rl == 1)
                        pre.setLchild(null);
                    else if (rl == 0)
                        pre.setRchild(null);
                    return true;
                }
                if (temp.getRchild() != null && temp.getLchild() == null) {
                    //目标节点有右子节点而没有左子节点
                    if (rl == 1)
                        pre.setRchild(temp.getRchild());
                    else if (rl == 0)
                        pre.setRchild(temp.getLchild());
                    return true;
                }
                if (temp.getRchild() == null && temp.getLchild() != null) {
                    //目标节点有左子节点而没有右子节点
                    if (rl == 1)
                        pre.setLchild(temp.getRchild());
                    else if (rl == 0)
                        pre.setLchild(temp.getLchild());
                    return true;
                }
                if (temp.getLchild() != null && temp.getRchild() != null) {
                    //目标节点的左右子节点均存在
                    
                }
            }
        }
    }

    /**
     * 获取二叉排序树的最大节点
     * @return result
     */
    public Integer getMax() {
        if (null == root)
            return null;
        BNode<Integer> temp = root;
        while (true) {
            if (temp.getRchild() != null)
                temp = temp.getRchild();
            else
                return temp.getData();
        }
    }

    /**
     * 获取二叉排序树的最小节点
     * @return result
     */
    public Integer getMin() {
        if (null == root)
            return null;
        BNode<Integer> temp = root;
        while (true) {
            if (temp.getLchild() != null)
                temp = temp.getLchild();
            else
                return temp.getData();
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        Integer[] array = new Integer[]{12, 3, 1};
        bst.insert(array);
        InOrder.inOrder(bst.root);
        System.out.println("get 方法得到：" + bst.get(3));
        System.out.println("getMax：" + bst.getMax() + ", getMin:"+ bst.getMin());

        BST bst2 = new BST();
        Integer[] array1 = new Integer[]{12, 14, 1, 8, 9};
        bst2.insert(array1);
        InOrder.inOrder(bst2.root);
        System.out.println("get 方法得到：" + bst2.get(1));
        System.out.println("getMax：" + bst2.getMax() + ", getMin:"+ bst2.getMin());
    }
}
