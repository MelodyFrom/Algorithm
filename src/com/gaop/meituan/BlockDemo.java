package com.gaop.meituan;

/**
 * @author gaopeng@doctorwork.com
 * @description 多线程调试技巧实例
 * @date 2018-12-31 10:54
 **/
public class BlockDemo implements Runnable{

    static BlockDemo instance = new BlockDemo();

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("对象锁实例，当前线程名称：" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("休眠时间结束，当前线程名称：" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
    }
}
