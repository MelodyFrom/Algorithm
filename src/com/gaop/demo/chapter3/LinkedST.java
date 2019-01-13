package com.gaop.demo.chapter3;

import com.gaop.demo.chapter3.core.AbstractST;
import com.gaop.demo.chapter3.core.ST;

import java.util.Iterator;

/**
 * 符号表最简单直接的实现-基于头插法的链表
 * @author gaopeng@doctorwork.com
 * @date 2019-01-11 12:16
 **/
public class LinkedST<Key, Value> extends AbstractST<Key, Value>{

    /**
     * 头结点
     */
    private Node head;

    /**
     * 链表 size
     */
    private int size;

    private class Node{

        Key key;

        Value val;

        Node next;

        public Node() {}

        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }

    @Override
    public void put(Key key, Value value) {
        // 不允许 null 为 key
        if (null == key)
            throw new UnsupportedOperationException("Linked ST can't set null as kay.");
        // 1 检查 key 值是否重复
        for (Node temp = head; temp != null; temp = temp.next) {
            if (key.equals(temp.key)) {
                temp.val = value;
                return;
            }
        }
        // 2 key 值不重复执行头插
        Node pre = new Node(key, value);
        pre.next = head;
        head = pre;
        size ++;
    }

    /**
     * get 方法的执行策略：当没有匹配的 key 的时候，就返回 null 而不是抛出异常
     * @param key 入参检索 key
     * @return
     */
    @Override
    public Value get(Key key) {
        for (Node temp = head; temp != null; temp = temp.next) {
            if (key.equals(temp.key)) {
                return temp.val;
            }
        }
        return null;
    }

    @Override
    public void delete(Key key) {
        // 检测有匹配的 key 则将其置为 null，并且修正当前链表的 size
        for (Node temp = head; temp != null; temp = temp.next) {
            if (key.equals(temp.key)) {
                this.put(key, null);
                temp.key = null; // 放空这个 node 节点
                size --;
                break;
            }
        }
    }

    @Override
    public boolean contains(Key key) {
        return super.contains(key);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public Iterator<Key> iterator() {
        return super.iterator();
    }

    public static void main(String[] args) {
        ST<Integer, String> st = new LinkedST<>();
        st.put(1, "1");
        st.put(2, "2");
        System.out.println(st.size());
        System.out.println(st.contains(1));
        st.delete(1);
        System.out.println(st.size());
        System.out.println(st.contains(1));
        st.delete(1);
        System.out.println(st.size());
    }
}
