package com.gaop.BinaryTree;

/**
 * 线索二叉树基础节点--和普通的二叉树相比，线索二叉树的每个节点都增加了两个标识位，用来标记每个节点的左右子节点是否是空指针域，
 * 如果是，就会利用这个空指针域存放节点的前驱/后继节点，具体存放的内容取决于二叉树的遍历算法。
 * @author gaopeng@doctorwork.com
 * @date 2019-01-15 22:23
 **/
public class ThreadBNode<T> {

    /**
     * 数据域
     */
    private T data;

    /**
     * 左子节点
     */
    private ThreadBNode lchild;

    /**
     * 右子节点
     */
    private ThreadBNode rchild;

    /**
     * 左标识
     */
    int rtag;

    /**
     * 右标识
     */
    int ltag;

    public ThreadBNode(T data, ThreadBNode lchild, ThreadBNode rchild) {
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

    public ThreadBNode getLchild() {
        return lchild;
    }

    public void setLchild(ThreadBNode lchild) {
        this.lchild = lchild;
    }

    public ThreadBNode getRchild() {
        return rchild;
    }

    public void setRchild(ThreadBNode rchild) {
        this.rchild = rchild;
    }

    public int getRtag() {
        return rtag;
    }

    public void setRtag(int rtag) {
        this.rtag = rtag;
    }

    public int getLtag() {
        return ltag;
    }

    public void setLtag(int ltag) {
        this.ltag = ltag;
    }

    @Override
    public String toString() {
        return "ThreadBNode{" +
                "data=" + data +
                ", lchild=" + lchild +
                ", rchild=" + rchild +
                ", rtag=" + rtag +
                ", ltag=" + ltag +
                '}';
    }
}
