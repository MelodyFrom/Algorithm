package com.gaop.demo.chapter3.core;

/**
 *  标准符号表接口定义 <br/>
 *  定义了一组通用的符号表方法，包含插入键值对、根据key删除键值对以及根据key检索等等的方法定义
 *  @author gaopeng@doctorwork.com
 **/
public interface ST<Key, Value> extends Iterable<Key>{

    void put(Key key, Value value);

    Value get(Key key);

    void delete(Key key);

    boolean contains(Key key);

    int size();

    boolean isEmpty();

}
