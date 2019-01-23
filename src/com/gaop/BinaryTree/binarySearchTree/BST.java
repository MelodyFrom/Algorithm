package com.gaop.BinaryTree.binarySearchTree;

import com.gaop.BinaryTree.BNode;
import com.gaop.BinaryTree.traverse.InOrder;

import java.util.ArrayList;
import java.util.List;

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
            } else if (temp.getData().equals(bNode.getData())){// 插入节点在现有的二叉树中已经存在了
                return;
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
        int rl = 0;
        BNode<Integer> temp = root;
        while (true) {
            if (temp.getData() > param) {
                pre = temp;//保存前一个节点--即保存一个父节点
                temp = temp.getLchild();
                rl = 1;//表示走到了左子树
            } else if (temp.getData() < param) {
                pre = temp;
                temp = temp.getRchild();
                rl = 2;//表示走到了右子树
            } else {
                //找到了要删除的节点
                if (temp.getRchild() == null && temp.getLchild() == null) {
                    // 目标节点没有任何子节点
                    if (rl == 1)
                        pre.setLchild(null);
                    else if (rl == 2)
                        pre.setRchild(null);
                    return true;
                }
                if (temp.getRchild() != null && temp.getLchild() == null) {
                    //目标节点有右子节点而没有左子节点
                    if (rl == 1)
                        pre.setLchild(temp.getRchild());
                    else if (rl == 2)
                        pre.setRchild(temp.getRchild());
                    return true;
                } else if (temp.getRchild() == null && temp.getLchild() != null) {
                    //目标节点有左子节点而没有右子节点
                    if (rl == 1)
                        pre.setLchild(temp.getLchild());
                    else if (rl == 2)
                        pre.setRchild(temp.getLchild());
                    return true;
                } else {
                    //目标节点的左右子节点均存在
                    /**
                     * 这里是二叉排序树中最麻烦的一个节点处理--即当前找到的待删除节点，既有右子树Pr，又有左子树Pl：有两种处理方案
                     * 1. 直接令待删除节点的左子树Pl替代到当前待删除节点的位置，然后将右子树Pr放到Pl子树中序遍历的最后一个节点的右子树上。
                     * 2. 第二种办法依赖于线索二叉树的前驱/后继节点的定位。暂时不表
                     */
                    if (rl == 1) {
                        pre.setLchild(temp.getLchild());
                    } else if (rl == 2) {
                        pre.setRchild(temp.getLchild());
                    }
                    BNode<Integer> inOrderLastNode = getInOrderLastNode(temp.getLchild());
                    inOrderLastNode.setRchild(temp.getRchild());
                    return true;
                }
            }
        }
    }

    /**
     * 返回一个二叉树中序遍历的节点列表
     * @param bNode 目标节点
     * @return list
     */
    private BNode<Integer> getInOrderLastNode(BNode<Integer> bNode) {
        if (bNode == null)
            return null;
        while (true) {
            if (bNode.getRchild() == null)
                return bNode;
            else
                bNode = bNode.getRchild();
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

        System.out.println("测试删除方法：");
        //节点删除方法测试
        bst.remove(1);
        InOrder.inOrder(bst.root);
        System.out.println("getMax：" + bst.getMax() + ", getMin:"+ bst.getMin());

        bst2.remove(1);
        InOrder.inOrder(bst2.root);
        System.out.println("getMax：" + bst2.getMax() + ", getMin:"+ bst2.getMin());

        System.out.println("测试删除含有左子节点的节点：");
        BST bst3 = new BST();
        Integer[] array3 = new Integer[]{17, 10, 8, 20, 18 ,21};
        bst3.insert(array3);
        InOrder.inOrder(bst3.root);
        System.out.println();
        bst3.remove(10);
        InOrder.inOrder(bst3.root);

        System.out.println();
        System.out.println("测试删除左右子节点均存在的节点：");
        BST bst4 = new BST();
        Integer[] array4 = new Integer[]{14, 10, 24, 20, 48};
        bst4.insert(array4);
        InOrder.inOrder(bst4.root);
        bst4.remove(24);
        System.out.println();
        InOrder.inOrder(bst4.root);
    }
}
