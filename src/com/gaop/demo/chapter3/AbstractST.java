package com.gaop.demo.chapter3;

import java.util.Iterator;

/**
 *
 *  符号表的抽象类，实现顶层接口，并给出部分基础方法的默认实现 <br/>
 *  注意这个抽象类的默认实现 contains() 方法，相当于默认了“不允许null作为value值”。如果需要自定义其他类型
 *  的数据结构，可以不使用这个抽象类的实现。
 *  @author gaopeng@doctorwork.com
 *  @date 2019-01-09 22:43
 **/
public class AbstractST<Key, Value> implements ST<Key, Value>{

    @Override
    public void put(Key key, Value value) {

    }

    @Override
    public Value get(Key key) {
        return null;
    }

    @Override
    public void  delete(Key key) {
        put(key, null);
    }

    @Override
    public boolean contains(Key key) {
        return null != get(key);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator<Key> iterator() {
        return null;
    }
}
