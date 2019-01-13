package com.gaop.BinaryTree;

/**
 * 二叉树基础节点
 * @author gaopeng@doctorwork.com
 * @date 2019-01-13 22:59
 **/
public class BNode<T> {

    /**
     * 数据域
     */
    private T data;

    /**
     * 左子节点
     */
    private BNode<T> lchild;

    /**
     * 右子节点
     */
    private BNode<T> rchild;

    public BNode() {}

    public BNode(T data, BNode lchild, BNode rchild) {
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BNode<T> getLchild() {
        return lchild;
    }

    public void setLchild(BNode<T> lchild) {
        this.lchild = lchild;
    }

    public BNode<T> getRchild() {
        return rchild;
    }

    public void setRchild(BNode<T> rchild) {
        this.rchild = rchild;
    }
}
