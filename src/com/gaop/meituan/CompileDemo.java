package com.gaop.meituan;

/**
 * 反编译demo
 * @author gaopeng@doctorwork.com
 * @description
 * @date 2018-12-31 15:17
 **/
public class CompileDemo {

    private Object monitor = new Object();

    public void insert(Thread thread) {
        synchronized (monitor) {

        }
    }
}
